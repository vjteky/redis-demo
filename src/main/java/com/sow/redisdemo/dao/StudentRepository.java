package com.sow.redisdemo.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sow.redisdemo.bean.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
	
}