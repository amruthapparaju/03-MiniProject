package com.miniproject.three.model;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class SsnModel {
	
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private  String phoneno;
	
	private String gender;
	
	@DateTimeFormat(pattern="yyyy-dd-mm")
	private Date dob;
			
	private String stateName;

	
	
	
	public String getFirstName() {
		return firstName;
	}




	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}




	public String getLastName() {
		return lastName;
	}




	public void setLastName(String lastName) {
		this.lastName = lastName;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getPhoneno() {
		return phoneno;
	}




	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}




	public String getGender() {
		return gender;
	}




	public void setGender(String gender) {
		this.gender = gender;
	}




	public Date getDob() {
		return dob;
	}




	public void setDob(Date dob) {
		this.dob = dob;
	}




	public String getStateName() {
		return stateName;
	}




	public void setStateName(String stateName) {
		this.stateName = stateName;
	}




	@Override
	public String toString() {
		return "SsnDTO [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneno=" + phoneno
				+ ", gender=" + gender + ", dob=" + dob + ", stateName=" + stateName + "]";
	}



	}
