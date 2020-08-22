package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_USER")
public class User {
	@Id
	private int id;
	
	private String First_name;
	private String Last_name;
	
	private String role;
	private String Dob;
	private String Email;
	private int Phone_no;
	private String Gender;
	private String Address;
	private String Aadhar_card;
	
	private String Username;
	private String Password;
	private String Pancard;
 
	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

}
