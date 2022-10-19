package com.example.demo;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	
	@GetMapping("/Students")
	public List<Student> getStudentList(){
		List<Student> students = new ArrayList<>();
		students.add(new Student("Rohit","Bisht"));
		students.add(new Student("Sagar","Rajput"));
		students.add(new Student("Mihir","Singh"));
		students.add(new Student("Sakshi","Bisht"));
		students.add(new Student("Riya","Roy"));
		students.add(new Student("Ritick","Kapil"));
		return students;
}
}
