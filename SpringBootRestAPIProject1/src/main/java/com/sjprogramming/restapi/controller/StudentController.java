package com.sjprogramming.restapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sjprogramming.restapi.entity.Students;
import com.sjprogramming.restapi.repository.StudentRepository;


@CrossOrigin
@RestController
public class StudentController {
	
	@Autowired
	
	StudentRepository repo;
	
	
	//get all students
	//localhost:8080/students
	@GetMapping("/students")
	public List<Students> getAllStudents(){
		List<Students> students=repo.findAll();
		
		return students;
		
	}
	
	@PostMapping("/ramya/add")
	public void createStudent(@RequestBody Students student) {
		repo.save(student);
	
		
	}
	

}
