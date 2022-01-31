package com.klef.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HcqlProjections {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     
	     SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    // max
	    Query q1 = session.createQuery("select max(age) from Student");
	    List li = q1.list();
	    System.out.println("The Maximum age in the Student Table    : "+li.get(0));
	    
	    
	    //min
	    Query q2 = session.createQuery("select min(age) from Student");
	    List li2 = q2.list();
	    System.out.println("The Minimum age in the Student Table   : "+li2.get(0));
	    
	    
	    //sum
	    Query q3 = session.createQuery("select sum(age) from Student");
	    List li3 = q3.list();
	    System.out.println("The sum of all student  age's  in the Student Table    :   "+li3.get(0));
	    
	    
	    //avg
	    Query q4 = session.createQuery("select avg(age) from Student");
	    List li4 = q4.list();
	    System.out.println("The average of all student age 's  in the Student Table    :   "+li4.get(0));
	    
	    
	    
	    
	    
	    
	    
	    Transaction transaction = session.beginTransaction();
	    
	    transaction.commit();

	}

}
