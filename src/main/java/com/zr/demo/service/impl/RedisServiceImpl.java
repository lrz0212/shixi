package com.zr.demo.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.zr.demo.service.RedisService;
@Service
public class RedisServiceImpl implements RedisService {
	@Autowired
	private RedisTemplate<String, Object> redisTemplate;
	@Override
	public void testRedis() {
		this.redisTemplate.opsForValue().set("study", "java");
        System.out.println(this.redisTemplate.opsForValue().get("study"));

	}

}
