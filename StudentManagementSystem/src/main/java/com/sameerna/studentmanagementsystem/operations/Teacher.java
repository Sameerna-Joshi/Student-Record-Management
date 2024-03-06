package com.sameerna.studentmanagementsystem.operations;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Teacher {
	@Id
	private int teacherId;
	private String teacherName;
	private int teacherNumber;
	
	
	
	public int getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(int teacherId) {
		this.teacherId = teacherId;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public int getTeacherNumber() {
		return teacherNumber;
	}
	public void setTeacherNumber(int teacherNumber) {
		this.teacherNumber = teacherNumber;
	}
	@Override
	public String toString() {
		return "Teacher [teacherId=" + teacherId + ", teacherName=" + teacherName + ", teacherNumber=" + teacherNumber
				+ "]";
	}
	
	
	
	
	

}
