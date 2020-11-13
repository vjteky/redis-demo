package com.sow.redisdemo.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sow.redisdemo.bean.Student;
import com.sow.redisdemo.bean.Student.Gender;

@SpringBootTest
public class StudentServiceTest {
	
	@Autowired
	private StudentService studentService;
	
	@Test
	public void studentServiceTest1() {
		
		Student student1 = new Student("101", "Jane Doe", Gender.FEMALE, 8);
		Student student2 = new Student("102", "John Lee", Gender.MALE, 10);
		
		studentService.saveStudent(student1);
		studentService.saveStudent(student2);
		
		Student rStudent1 = studentService.retrieveStudent(student1.getId());
		Student rStudent2 = studentService.retrieveStudent(student2.getId());
		
		assertEquals(student1.getName(), rStudent1.getName());
		assertEquals(student2.getName(), rStudent2.getName());
		
		studentService.updateStudent(student1.getId(), student1.getName()+"updated");
		rStudent1 = studentService.retrieveStudent(student1.getId());
		assertEquals(student1.getName()+"updated", rStudent1.getName());
		
		studentService.deleteStudent(student2.getId());
		rStudent2 = studentService.retrieveStudent(student2.getId());
		assertNull(rStudent2);
	}

}
