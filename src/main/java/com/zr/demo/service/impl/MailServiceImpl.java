package com.zr.demo.service.impl;

import javax.annotation.Resource;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.zr.demo.service.MailService;
@Service
public class MailServiceImpl implements MailService {
	@Resource
    private JavaMailSender javaMailSender ;

	@Override
	public void testSendMail() {
		 SimpleMailMessage message = new SimpleMailMessage() ;    // 要发送的消息内容
	        message.setFrom("535825837@qq.com ");
	        message.setTo("1425203342@qq.com ");
	        message.setSubject("测试邮件）");
	        message.setText("好好学习，天天向上");
	        this.javaMailSender.send(message);
		
	}

}
