package com.novasystems.sponsors.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name ="sponsor_tbl")
@Getter
@Setter
public class sponsorEntity {
	
	@Column(name="sponsorId")
	Integer sponsorId;
	
	@Column(name="sponsorName")
	String sponsorName;
	
	@Column(name="address")
	String address;
	
	@Column(name="city")
	String city;

}
