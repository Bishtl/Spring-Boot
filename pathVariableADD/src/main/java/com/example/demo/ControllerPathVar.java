package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerPathVar {
	
	@GetMapping("/sum/{a}/{b}")
	public int getResult(@PathVariable("a") int a , @PathVariable("b") int b) {
		int c = a+b;
		return c;
	}
	
}
