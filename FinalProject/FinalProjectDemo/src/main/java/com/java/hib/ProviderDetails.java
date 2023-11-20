package com.java.hib;

public class ProviderDetails {
	
	private String providerid;
	private String name;
	private String email;
	private String username;
	private String phoneno;
	private Gender gender;
	private String specialty;
	private Type type;
	private String address;
	public String getProviderid() {
		return providerid;
	}
	public void setProviderid(String providerid) {
		this.providerid = providerid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
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
	public Gender getGender() {
		return gender;
	}
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	public String getSpecialty() {
		return specialty;
	}
	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public ProviderDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProviderDetails(String providerid, String name, String email, String username, String phoneno, Gender gender,
			String specialty, Type type, String address) {
		super();
		this.providerid = providerid;
		this.name = name;
		this.email = email;
		this.username = username;
		this.phoneno = phoneno;
		this.gender = gender;
		this.specialty = specialty;
		this.type = type;
		this.address = address;
	}
	@Override
	public String toString() {
		return "ProviderDetails [providerid=" + providerid + ", name=" + name + ", email=" + email + ", username="
				+ username + ", phoneno=" + phoneno + ", gender=" + gender + ", specialty=" + specialty + ", type="
				+ type + ", address=" + address + "]";
	}
	
	
	
}