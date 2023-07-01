package com.prowings.table_per_class_strategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "STUDENT")
public class Student extends Person {
	
	@Column(name = "STUDENT_GRADE")
	String grade;
	
	@Column(name = "STUDENT_FEES")
	double fees;
	
	
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Student [grade=" + grade + ", fees=" + fees + ", id=" + id + ", name=" + name + "]";
	}
	
	
	

}
