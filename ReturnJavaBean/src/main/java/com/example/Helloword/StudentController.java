package com.example.Helloword;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	@GetMapping("/student")
	
	public Student getStrudentName() {
		return new Student("Rohit","Bisht");
	}

}
