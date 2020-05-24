package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Student {
	
	@Id
	@GeneratedValue
	private Long id;
	private String studentName;
	private String studentSchool;
	private String studentClass;
	private String studentStream;
	
	public Student() {
		
	}
	
	public Student(Long id,String sName,String sSchool,String sClass,String sStream) {
		this.id=id;
		this.studentName=sName;
		this.studentSchool=sSchool;
		this.studentClass=sClass;
		this.studentStream=sStream;
		
	}

	public Student(String sName,String sSchool,String sClass,String sStream) {
		this.studentName=sName;
		this.studentSchool=sSchool;
		this.studentClass=sClass;
		this.studentStream=sStream;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSchool() {
		return studentSchool;
	}

	public void setStudentSchool(String studentSchool) {
		this.studentSchool = studentSchool;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public String getStudentStream() {
		return studentStream;
	}

	public void setStudentStream(String studentStream) {
		this.studentStream = studentStream;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", studentName=" + studentName + ", studentSchool=" + studentSchool
				+ ", studentClass=" + studentClass + ", studentStream=" + studentStream + "]";
	}
	
	
}
