package com.lti.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PAY")
public class Payment {
	@Id
	private int id;
	@OneToOne
	@JoinColumn(name = "bidder_id")
	private Bid bid;
}
