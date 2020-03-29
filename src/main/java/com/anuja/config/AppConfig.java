package com.anuja.config;

import org.springframework.context.annotation.Configuration;

import com.anuja.spring.services.Test;

@Configuration
public class AppConfig {

	public AppConfig() {
		super();
		System.out.println("Configuration file Executed");
	}

	// @Bean
	public Test getTestBean() {
		return new Test();
	}
}
