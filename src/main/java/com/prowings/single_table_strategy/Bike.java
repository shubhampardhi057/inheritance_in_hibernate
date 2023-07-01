package com.prowings.single_table_strategy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "BIKE")
@DiscriminatorValue("BikeRecord")
public class Bike extends Vehicle{
	
	@Column(name = "BIKE_STAND")
	String stand;
	
	@Column(name = "BIKE_STEERING_TYPE")
	String steeringType;
	
	
	public String getStand() {
		return stand;
	}
	public void setStand(String stand) {
		this.stand = stand;
	}
	public String getSteeringType() {
		return steeringType;
	}
	public void setSteeringType(String steeringType) {
		this.steeringType = steeringType;
	}
	@Override
	public String toString() {
		return "Bike [stand=" + stand + ", steeringType=" + steeringType + ", id=" + id + ", name=" + name + "]";
	}
	

	
	
}
