package com.zr.demo.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zr.demo.producer.IMessageProducerService;
import com.zr.demo.service.MailService;
import com.zr.demo.service.RedisService;
import com.zr.demo.service.UserService;
import com.zr.model.User;

@RestController
public class Controller {
	@Autowired
	private UserService userService;
	@Autowired
	private IMessageProducerService messageProducer;
	@Autowired
	private MailService mailService;
	@Autowired
	private RedisService redisService;
	
	@RequestMapping(value = "/abc")
	public User home() {
		return userService.selectUserById(1);
	}
	
	@RequestMapping(value = "/q")
	public void home1() {
		for (int x = 0; x < 10; x++) {
            this.messageProducer.sendMessage("study - " + x);
        }
	}
	
	@RequestMapping(value = "/s")
	public void mail() {
		for (int i = 0; i < 5; i++) {
			mailService.testSendMail();
		}
		System.out.println("success");
	}
	
	@RequestMapping(value = "/r")
	public List<User> redis() {
		return userService.selectAllUsers();
	}
	
	@RequestMapping(value = "/re")
	public void testRedis() {
		redisService.testRedis();
	}
	
	@RequestMapping(value = "/testwar")
	public String testwar() {
		return "helloWorld";
	}
}
