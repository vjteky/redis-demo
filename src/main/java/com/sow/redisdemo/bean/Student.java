package com.sow.redisdemo.bean;

import java.io.Serializable;

import org.springframework.data.redis.core.RedisHash;

@RedisHash("Student")
public class Student implements Serializable {
  
	private static final long serialVersionUID = 1L;
	
	public enum Gender { 
        MALE, FEMALE
    }
 
    private String id;
    private String name;
    private Gender gender;
    private int grade;
    
    public Student() {
    	
    }
    
    public Student(String id, String name, Gender gender, int grade) {
    	this.id = id;
    	this.name = name;
    	this.gender = gender;
    	this.grade = grade;
    }
	
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
}