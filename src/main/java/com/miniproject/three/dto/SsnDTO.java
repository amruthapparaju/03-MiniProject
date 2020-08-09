package com.miniproject.three.dto;

import java.util.Date;

public class SsnDTO {
	
	private  String ssnNo;
	
	private String firstName;
	
	private String lastName;
	
	private String email;
	
	private  String phoneno;
	
	private String gender;
	
	private Date dob;
			
	private String stateName;
	
//	@Column(name = "city_id" )
	//private Integer cityId;

	private Date createdDate;
	private Date updatedDate;
	
	public String getSsnNo() {
		return ssnNo;
	}
	public void setSsnNo(String ssnNo) {
		this.ssnNo = ssnNo;
	}
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

	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Date getUpdatedDate() {
		return updatedDate;
	}
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	@Override
	public String toString() {
		return "SsnEntity [ssnNo=" + ssnNo + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", phoneno=" + phoneno + ", gender=" + gender + ", dob=" + dob + ", stateName=" + stateName
				+ ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + "]";
	}




}
