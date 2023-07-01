package com.prowings.test_inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.table_per_class_strategy.Student;
import com.prowings.table_per_class_strategy.Teacher;

public class TestTable_Per_Class_Inheritance {
	
	public static void main(String[] args) {
		
		Teacher teacher = new Teacher();
		teacher.setId(1);
		teacher.setName("Sk_sir");
		teacher.setSalary(50000.0d);
		teacher.setYearOfExperience(10);
		
		Student student = new Student();
		student.setId(2);
		student.setName("Ram");
		student.setFees(10000.0d);
		student.setGrade("A+");
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(teacher);
		session.save(student);
		
		txn.commit();
		session.close();
	}

}
