package com.sameerna.studentmanagementsystem.registeration;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Signup {
	@Id
	private int phonenumber;
	private String name;
	
	private String password;
	@Transient
	private String confirmPassword;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	@Override
	public String toString() {
		return "Signup [name=" + name + ", phonenumber=" + phonenumber + ", password=" + password + ", confirmPassword="
				+ confirmPassword + "]";
	}
	
	
}
