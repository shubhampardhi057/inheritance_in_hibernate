package com.prowings.single_table_strategy;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="CAR")
@DiscriminatorValue("CarRecord")
public class Car extends Vehicle {
	
	@Column(name = "CAR_WIPER")
	String wiper;
	
	@Column(name = "CAR_STEERINGTYPE")
	String steeringType;
	
	
	public String getWiper() {
		return wiper;
	}
	public void setWiper(String wiper) {
		this.wiper = wiper;
	}
	public String getSteeringType() {
		return steeringType;
	}
	public void setSteeringType(String steeringType) {
		this.steeringType = steeringType;
	}
	@Override
	public String toString() {
		return "Car [wiper=" + wiper + ", steeringType=" + steeringType + ", id=" + id + ", name=" + name + "]";
	}
	
	
	
}
