package com.example.hello.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {
	
	
	@RequestMapping()
	public String sayHello() {
		return "Hello";
	}
	
}
