package com.bhas.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController 
{
	// test endPoint,
	@GetMapping()
	@ResponseStatus(code = HttpStatus.VARIANT_ALSO_NEGOTIATES)
	public String greetMsg()
	{
		return "Welcome to the StreamAPI";
	}
}
