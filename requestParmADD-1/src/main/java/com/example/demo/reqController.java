package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class reqController {

	@GetMapping("/Add")
	public int getResult(@RequestParam(name = "first") int a ,
			@RequestParam(name = "second")int b, 
			@RequestParam(name = "third") int c) {
		int sum = a+b+c;
		return sum;
		
	}
}
