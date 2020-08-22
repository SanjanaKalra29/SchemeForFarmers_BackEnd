package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_BID")

public class Bid {
	@Id
	private int id;
	private double amount;

	@ManyToOne
	@JoinColumn(name = "bidder_id")
	private User user;
	@OneToMany
	@JoinColumn(name = "crop_id")
	private Crop crop;

}
