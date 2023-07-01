package com.prowings.table_per_class_strategy;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "TEACHER")
public class Teacher extends Person {
	
	@Column(name = "TEACHER_YEAR_OF_EXPERIENCE")
	int yearOfExperience;
	
	@Column(name = "TEACHER_SALARY")
	double salary;
	
	
	public int getYearOfExperience() {
		return yearOfExperience;
	}
	public void setYearOfExperience(int yearOfExperience) {
		this.yearOfExperience = yearOfExperience;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Teacher [yearOfExperience=" + yearOfExperience + ", salary=" + salary + ", id=" + id + ", name=" + name
				+ "]";
	}
	
	

}
