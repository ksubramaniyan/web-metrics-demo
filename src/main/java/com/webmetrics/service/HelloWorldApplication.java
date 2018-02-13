package com.webmetrics.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.codahale.metrics.health.HealthCheck;

import webmetrics.admin.HealthCheckManager;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages={"com.webmetrics"})
public class HelloWorldApplication {

	public static void main(String[] args) {
		
		HealthCheckManager.addHealthCheck("Health Check 1", new HealthCheck() {
			
			@Override
			protected Result check() throws Exception {
			 return Result.healthy("Working fine");
			}
		});
    	
		HealthCheckManager.addHealthCheck("Health Check 2", new HealthCheck() {
			
			@Override
			protected Result check() throws Exception {
			 return Result.healthy(String.valueOf(Runtime.getRuntime().freeMemory()));
			}
		});
		HealthCheckManager.addHealthCheck("Maintenance Mode", new HealthCheck() {
			
			@Override
			protected Result check() throws Exception {
			 return Result.healthy("Maintenance");
			}
		});
		
		ApplicationContext ctx = SpringApplication.run(HelloWorldApplication.class, args);
	}

}
