package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@ServletComponentScan
@SpringBootApplication
public class SpringBootSampleRedisApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootSampleRedisApplication.class, args);
	}
}
