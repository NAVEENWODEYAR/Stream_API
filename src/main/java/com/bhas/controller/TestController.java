package com.bhas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	// test endPoint,
	@GetMapping()
	public String greetMsg()
	{
		return "Welcome to the StreamAPI";
	}
}
