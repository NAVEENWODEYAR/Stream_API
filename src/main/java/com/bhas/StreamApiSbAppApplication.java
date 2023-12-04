package com.bhas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamApiSbAppApplication 
{

	public static void main(String[] args) 
	{
		SpringApplication.run(StreamApiSbAppApplication.class, args);
		System.out.println("\nStream is just an interface");
	}

}
