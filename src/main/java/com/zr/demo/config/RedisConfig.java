package com.zr.demo.config;

import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.zr.demo.util.redis.RedisObjectSerializer;
import com.zr.model.User;

@Configuration
public class RedisConfig {
	@Bean
    public RedisTemplate<String, List<User>> getRedisTemplate(RedisConnectionFactory factory) {
        RedisTemplate<String, List<User>> redisTemplate = new RedisTemplate<String, List<User>>();
        redisTemplate.setConnectionFactory(factory);
        redisTemplate.setKeySerializer(new StringRedisSerializer()); // key的序列化类型
        redisTemplate.setValueSerializer(new RedisObjectSerializer()); // value的序列化类型
        return redisTemplate;
    }
	@Bean
    public RedisTemplate<String, Object> getRedisTemplate1(RedisConnectionFactory factory) {
        RedisTemplate<String, Object> redisTemplate = new RedisTemplate<String, Object>();
        redisTemplate.setConnectionFactory(factory);
        redisTemplate.setKeySerializer(new StringRedisSerializer()); // key的序列化类型
        redisTemplate.setValueSerializer(new RedisObjectSerializer()); // value的序列化类型
        return redisTemplate;
    }
}
