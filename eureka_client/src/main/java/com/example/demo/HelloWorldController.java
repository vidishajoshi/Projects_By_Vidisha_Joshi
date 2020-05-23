package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello_world/{name}")
	public String getHello(@PathVariable String name) {
		return "Hello to this world" +name;
	}
}
