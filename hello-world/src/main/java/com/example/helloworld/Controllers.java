package com.example.helloworld;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class Controllers {

	@GetMapping(value="/hello") //localhost:7888/hello
	public String getMethodName() { 
		return "Hello";
	}
	
	@GetMapping(value="/get-request", produces = MediaType.APPLICATION_JSON_VALUE) //localhost:7888/get-request
	public SubmitForm getRequest() {
		SubmitForm submitForm = new SubmitForm();
		submitForm.setBody("body");
		submitForm.setTitle("title");
		return submitForm;
	}
	
	@PostMapping(value="/post-request") //localhost:7888/get-request
	public void postRequest(@RequestBody SubmitForm submitForm) {
		System.out.println(submitForm.getBody() + " " + submitForm.getTitle());
	}
}
