package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_CROP")
public class Crop {
	@Id
	private int id;

	@ManyToOne
	@JoinColumn(name = "farmer_id")
	private User user;
}
