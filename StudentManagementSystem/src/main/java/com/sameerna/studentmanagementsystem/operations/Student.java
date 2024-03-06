package com.sameerna.studentmanagementsystem.operations;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student 
{ @Id
  private int studentId;
  private String studentName;
  private String fatherName;
  private int parentNumber;
//  private String parentName;
 private String gender;

private int teacherId;
  private int marks1;
  private int marks2;
  private int marks3;
  private int marks4;
  private int marks5;
  private int marks6;
  private int totalMarks;
  private int marksSecured;
  private String result;
  
 
  
public int getTotalMarks() {
	return totalMarks;
}
public void setTotalMarks(int totalMarks) {
	this.totalMarks = totalMarks;
}
public int getMarksSecured() {
	return marksSecured;
}
public void setMarksSecured(int marksSecured) {
	this.marksSecured = marksSecured;
}
public String getResult() {
	return result;
}
public void setResult(String result) {
	this.result = result;
}
public int getStudentId() {
	return studentId;
}
public void setStudentId(int studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getFatherName() {
	return fatherName;
}
public void setFatherName(String fatherName) {
	this.fatherName = fatherName;
}
public int getParentNumber() {
	return parentNumber;
}
public void setParentNumber(int parentNumber) {
	this.parentNumber = parentNumber;
}
public int getTeacherId() {
	return teacherId;
}
public void setTeacherId(int teacherId) {
	this.teacherId = teacherId;
}
public int getMarks1() {
	return marks1;
}
public void setMarks1(int marks1) {
	this.marks1 = marks1;
}
public int getMarks2() {
	return marks2;
}
public void setMarks2(int marks2) {
	this.marks2 = marks2;
}
public int getMarks3() {
	return marks3;
}
public void setMarks3(int marks3) {
	this.marks3 = marks3;
}
public int getMarks4() {
	return marks4;
}
public void setMarks4(int marks4) {
	this.marks4 = marks4;
}
public int getMarks5() {
	return marks5;
}
public void setMarks5(int marks5) {
	this.marks5 = marks5;
}
public int getMarks6() {
	return marks6;
}
public void setMarks6(int marks6) {
	this.marks6 = marks6;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", fatherName=" + fatherName
			+ ", parentNumber=" + parentNumber + ", gender=" + gender + ", teacherId=" + teacherId + ", marks1="
			+ marks1 + ", marks2=" + marks2 + ", marks3=" + marks3 + ", marks4=" + marks4 + ", marks5=" + marks5
			+ ", marks6=" + marks6 + ", totalMarks=" + totalMarks + ", marksSecured=" + marksSecured + ", result="
			+ result + "]";
}



  
  
}
