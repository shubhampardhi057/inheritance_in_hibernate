package com.prowings.test_inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.single_table_strategy.Bike;
import com.prowings.single_table_strategy.Car;
import com.prowings.single_table_strategy.Vehicle;

public class TestSingle_Table_Inheritance {
	
	public static void main(String[] args) {
	
		Bike bike = new Bike();
		bike.setId(1);
		bike.setName("Yamaha");
		bike.setStand("Side Stand");
		bike.setSteeringType("Handle");
		
		Car car = new Car();
		car.setId(2);
		car.setName("Virtus");
		car.setWiper("SimpleWiper");
		car.setSteeringType("ElectronicSteering");
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(car);
		session.save(bike);
		
		
		Vehicle vehicleRetrived = session.get(Vehicle.class,2);
		
		System.out.println(vehicleRetrived);
		
		
		txn.commit();
		session.close();
		
	}
	

}
