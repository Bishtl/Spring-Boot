package com.example.Helloword;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helo {
	@GetMapping("/Hello")
	public String Helloworld(){
		return "Hello-World";
	}

}
