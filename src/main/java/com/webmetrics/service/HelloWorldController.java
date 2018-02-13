package com.webmetrics.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {


	
	@RequestMapping(value = "/")
	public String sayHello()  {
		return "Hellow World!!";
	}
}
