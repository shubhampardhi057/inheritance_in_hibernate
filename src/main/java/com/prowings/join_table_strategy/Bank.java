package com.prowings.join_table_strategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name = "BANK")
@Inheritance(strategy = InheritanceType.JOINED)
public class Bank {
	
	@Id
	@Column(name = "BANK_ID")
	int bankID;
	
	@Column(name = "BANK_TYPE")
	String bankType;
	
	public Bank() {
		super();
	}

	public Bank(int bankID, String bankType) {
		super();
		this.bankID = bankID;
		this.bankType = bankType;
	}

	public int getBankID() {
		return bankID;
	}

	public void setBankID(int bankID) {
		this.bankID = bankID;
	}

	public String getBankType() {
		return bankType;
	}

	public void setBankType(String bankType) {
		this.bankType = bankType;
	}

	@Override
	public String toString() {
		return "Bank [bankID=" + bankID + ", bankType=" + bankType + ", getBankID()=" + getBankID() + ", getBankType()="
				+ getBankType() + "]";
	}
	
	
	

}
