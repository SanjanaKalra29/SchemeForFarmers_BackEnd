package com.lti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Ur_Details")
@NamedQuery(name = "logincheck", query = "select u.id from User u where u.email = :em and u.password = :pw")
@NamedQuery(name = "count", query = "select count(u.id) from User u where u.email = :em")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "User_id")
	private int id;

	@Column(name = "Full_name")
	private String fullname;

	@Column(name = "Role")
	private String role;

	@Column(name = "Email")
	private String email;

	@Column(name = "Phone_Number")
	private long phoneno;

	@Column(name = "Aadhar_Card")
	private long Aadharcard;

	@Column(name = "Password")
	private String password;

	@Column(name = "Pancard")
	private String pancard;

	@Column(name = "Account_Number")
	private String accountNumber;

	@Column(name = "Ifsc_Code")
	private String ifscCode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public long getAadharcard() {
		return Aadharcard;
	}

	public void setAadharcard(long aadharcard) {
		Aadharcard = aadharcard;
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

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getIfsc_Code() {
		return ifscCode;
	}

	public void setIfsc_Code(String ifscCode) {
		this.ifscCode = ifscCode;
	}

}
