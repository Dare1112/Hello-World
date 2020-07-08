package com.example.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication 

public class DemoApplication {
	
	//The rest controllers can be found in Controllers.java
	//In resources/static you can find the index.html that you provided
	//index.html is now defaultly loaded when localhost:7888 is being accessed
	//Only thing left is to change the request and response that is being sent through the
	//contorllers so that fits your assignment 

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
