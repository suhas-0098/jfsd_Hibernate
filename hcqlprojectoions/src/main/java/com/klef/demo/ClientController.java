package com.klef.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientController {
	
	public static void main(String args[]) {
		
		Configuration cfg = new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     
	     SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Student s = new Student();
	    s.setId(106);
	    s.setName("SUDHEER");
	    s.setGender("MALE");
	    s.setDepartment("CSE");
	    s.setYear(2021);
	    s.setAge(21);
	    
	    Transaction transaction = session.beginTransaction();
	    session.save(s);
	    System.out.println("Object Saved");
	    transaction.commit();
	}

}
