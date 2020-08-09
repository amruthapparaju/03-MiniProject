package com.miniproject.three.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="adhar_details")
public class SsnEntity {
	
	
	@Id
    @GenericGenerator(name = "ADHAR_NO", strategy = "com.miniproject.three.generator.AdharGenerator")
	//format=XX-XX-XXXX
	@GeneratedValue(generator = "ADHAR_NO")
	@Column(name="ADHAR_NO")
	private  String ssnNo;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@Column(name="EMAIL")
	private String email;
	
	@Column(name = "phone_no" )
	private  String phoneno;
	
	private String gender;
	
	private Date dob;
			
	@Column(name = "state_name" )
	private String stateName;
	
//	@Column(name = "city_id" )
	//private Integer cityId;

	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)	
	@Column(name = "created_date",updatable = false )
	private Date createdDate;
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)	
	@Column(name = "updated_date",insertable = false)
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
