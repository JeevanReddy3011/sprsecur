package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity

public class User {
	
	@Id
	private int userId;
	private String fullName;
	private String image;
	private String emailId;
	private String password;
	private long mobileNumber;
	private String address;
	private String about;
	private String dob;
	private String gender;
	private String role;
	
	
	public User(int userId, String fullName, String image, String emailId, String password, long mobileNumber,
			String address, String about, String dob, String gender, String role) {
		
		this.userId = userId;
		this.fullName = fullName;
		this.image = image;
		this.emailId = emailId;
		this.password = password;
		this.mobileNumber = mobileNumber;
		this.address = address;
		this.about = about;
		this.dob = dob;
		this.gender = gender;
		this.role = role;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public User() {
		
	}
	
	
	
	
}
