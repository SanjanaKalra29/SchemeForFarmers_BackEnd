package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "User_Details")
@NamedQuery(name = "logincheck", query = "select u.id from User u where u.email = :em and u.password = :pw")
@NamedQuery(name = "count", query = "select count(u.id) from User u where u.email = :em")
public class User {
	@Id
	@Column(name = "User_id")
	private int id;

	@Column(name = "First_name")
	private String firstname;

	@Column(name = "Last_name")
	private String lastname;

	@Column(name = "Role")
	private String role;

	@Column(name = "DOB")
	private String dob;

	@Column(name = "Email")
	private String email;

	@Column(name = "Phone_Number")
	private long phoneno;

	@Column(name = "Gender")
	private String gender;

	@Column(name = "Address")
	private String address;

	@Column(name = "Aadhar_Card")
	private long Aadharcard;

	@Column(name = "Username")
	private String username;

	@Column(name = "Password")
	private String password;

	@Column(name = "Pancard")
	private String pancard;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(long phoneno) {
		this.phoneno = phoneno;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getAadharcard() {
		return Aadharcard;
	}

	public void setAadharcard(long aadharcard) {
		Aadharcard = aadharcard;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPancard() {
		return pancard;
	}

	public void setPancard(String pancard) {
		this.pancard = pancard;
	}

}
