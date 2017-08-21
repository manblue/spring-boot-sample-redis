package com.example.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/redis/")
public class StringRedisController {
	private static Logger logger = LoggerFactory.getLogger(StringRedisController.class);
	
	@Autowired
	private StringRedisTemplate redisTemplate;
	
	@Resource(name = "redisTemplate")
	ValueOperations<String, String> valOps;
	
	@RequestMapping("set")
	public String set(String key, String value) {
		logger.debug("访问set:key={},value={}",key,value);  
		valOps.set(key, value);
		
		return "ok";
	}
	
	@RequestMapping("get")
	public String get(String key) {
		logger.debug("访问get:key={}",key);  
		return valOps.get(key);
	}
}
