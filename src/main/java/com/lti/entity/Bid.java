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
@Table(name="Bid_Tbl")
//@NamedQuery(name = "bidAll ", query = "select b from Bid b where b.cropid = :ci")
public class Bid {
	
  @Id
  @GeneratedValue
  @Column(name="Bid_id")
  private int bidId;
  
  @OneToOne
  @JoinColumn(name="Bidder_id")
  private User user;
  
  
  @OneToOne()
  @JoinColumn(name = "Crop_id") 
	private Crop crop; 
  
  @Column(name="Bit_Amount")
  private long amount;

}
