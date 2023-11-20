package com.java.hib;

import java.util.Date;

public class Patientenrollment {
	
	private String uhid;
	private String firstname;
	private String lastname;
	private Date date;
	private String gender;
	private String username;
	private String phoneno;
	private String email;
	private String status;
	private String cause;
	private String address;
	private String medhistory;
	public String getUhid() {
		return uhid;
	}
	public void setUhid(String uhid) {
		this.uhid = uhid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCause() {
		return cause;
	}
	public void setCause(String cause) {
		this.cause = cause;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMedhistory() {
		return medhistory;
	}
	public void setMedhistory(String medhistory) {
		this.medhistory = medhistory;
	}
	public Patientenrollment(String uhid, String firstname, String lastname, Date date, String gender, String username,
			String phoneno, String email, String status, String cause, String address, String medhistory) {
		super();
		this.uhid = uhid;
		this.firstname = firstname;
		this.lastname = lastname;
		this.date = date;
		this.gender = gender;
		this.username = username;
		this.phoneno = phoneno;
		this.email = email;
		this.status = status;
		this.cause = cause;
		this.address = address;
		this.medhistory = medhistory;
	}
	public Patientenrollment() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Patientenrollment [uhid=" + uhid + ", firstname=" + firstname + ", lastname=" + lastname + ", date="
				+ date + ", gender=" + gender + ", username=" + username + ", phoneno=" + phoneno + ", email=" + email
				+ ", status=" + status + ", cause=" + cause + ", address=" + address + ", medhistory=" + medhistory
				+ "]";
	}
	
	

}
