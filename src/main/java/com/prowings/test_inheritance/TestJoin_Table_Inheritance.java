package com.prowings.test_inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.join_table_strategy.HDFC;
import com.prowings.join_table_strategy.SBI;

public class TestJoin_Table_Inheritance {
	
	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		sbi.setBankID(1);
		sbi.setBankType("GOVERMENT");
		sbi.setBranchName("SBI_PUNE");
		sbi.setIfscCode("SBIPUNE1234P");
		
		HDFC hdfc = new HDFC();
		hdfc.setBankID(2);
		hdfc.setBankType("PRIVATE");
		hdfc.setBranchName("HDFC_MUMBAI");
		hdfc.setIfscCode("HDFCMUMBAI4321M");
		
		
		Configuration cfg = new Configuration();
		
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		session.save(sbi);
		session.save(hdfc);
		
		txn.commit();
		session.close();
	}

}
