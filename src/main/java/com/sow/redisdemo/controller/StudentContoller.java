package com.sow.redisdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sow.redisdemo.bean.Student;
import com.sow.redisdemo.bean.Student.Gender;
import com.sow.redisdemo.service.StudentService;

@RestController
@RequestMapping (path="/student")
public class StudentContoller {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping (value="/add/{id}", method=RequestMethod.GET)
	public void addStudent(@PathVariable(value="id") String id) {
		
		Student student = new Student(id,"name-"+id, Gender.MALE, 9);
		
		studentService.saveStudent(student);
	}
	
	@RequestMapping (value="/get/{id}", method=RequestMethod.GET)
	public Student getStudent(@PathVariable(value="id") String id) {
		
		Student student = studentService.retrieveStudent(id);
		
		return student;
	}
	
	@RequestMapping (value="/test", method=RequestMethod.GET)
	public String test1() {
		
		return "hello test";
	}

}
