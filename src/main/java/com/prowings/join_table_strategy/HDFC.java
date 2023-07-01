package com.prowings.join_table_strategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "HDFC")
public class HDFC extends Bank{
	
	@Column(name = "BRANCH_NAME")
	String branchName;
	
	@Column(name = "IFSC_CODE")
	String ifscCode;
	
	
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	@Override
	public String toString() {
		return "HDFC [branchName=" + branchName + ", ifscCode=" + ifscCode + ", bankID=" + bankID + ", bankType="
				+ bankType + "]";
	}
	
	
	

}
