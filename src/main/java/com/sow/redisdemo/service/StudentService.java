package com.sow.redisdemo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sow.redisdemo.bean.Student;
import com.sow.redisdemo.dao.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	public void saveStudent(Student student) {
		studentRepository.save(student);
	}
	
	public Student retrieveStudent(String studentId) {
		Optional<Student> resultOptional = studentRepository.findById(studentId);
		
		if (resultOptional.isPresent()) {
			return resultOptional.get();
		}
		
		return null;
	}
	
	public void updateStudent(String studentId, String studentName) {
		Student student = retrieveStudent(studentId);
		student.setName(studentName);
		studentRepository.save(student);
	}
	
	public void deleteStudent(String studentId) {
		studentRepository.deleteById(studentId);

	}

}
