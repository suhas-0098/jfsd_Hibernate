package com.klef.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ClientController {

	public static void main(String agrs[]) {
//		
//		Configuration cfg = new Configuration();
//	     cfg.configure("hibernate.cfg.xml");
//	     
//	     SessionFactory sf = cfg.buildSessionFactory();
//	    Session session = sf.openSession();
//	    
//	    Student s = new Student();
//	    s.setId(103);
//	    s.setName("SAI KUMAR");
//	    s.setDepartment("CSE");
//	    s.setGender("MALE");
//	    s.setAge(20.5);
//	    
//	    Transaction transaction = session.beginTransaction();
//	    session.save(s);
//	    System.out.println("Object Saved");
//	    transaction.commit();
//	    
//	    session.close();
//	    sf.close();
		
		
//		Configuration cfg = new Configuration();
//	     cfg.configure("hibernate.cfg.xml");
//	     
//	     SessionFactory sf = cfg.buildSessionFactory();
//	    Session session = sf.openSession();
//	    
//	    Object obj = session.load(Student.class, new Integer(101));
//	    
//	    Student s = (Student) obj;
//	    s.setName("ARIGALA SUHAS");
//	    s.setDepartment("IT");
//	    
//	    Transaction transaction = session.beginTransaction();
//	    session.update(s);
//	    System.out.println("Object Updated");
//	    transaction.commit();
	    
//	    session.close();
//	    sf.close();
//		
		
		
//		Configuration cfg = new Configuration();
//	     cfg.configure("hibernate.cfg.xml");
//	     
//	     SessionFactory sf = cfg.buildSessionFactory();
//	    Session session = sf.openSession();
//	    
//	    Object obj = session.load(Student.class, new Integer(103));
//	    
//	    Student s = (Student) obj;
//	    
//	    Transaction transaction = session.beginTransaction();
//	    session.delete(s);
//	    System.out.println("Object Deleted");
//	    transaction.commit();
//	    
//	    session.close();
//	    sf.close();
		
		
		Configuration cfg = new Configuration();
	     cfg.configure("hibernate.cfg.xml");
	     
	     SessionFactory sf = cfg.buildSessionFactory();
	    Session session = sf.openSession();
	    
	    Object obj = session.get(Student.class, new Integer(101));
	    
	    Student s = (Student) obj;
	    
	  System.out.println(s.getId());
	  System.out.println(s.getName());
	  System.out.println(s.getDepartment());
	  System.out.println(s.getAge());
	  System.out.println(s.getGender());
	    
//	    session.close();
//	    sf.close();
	}
}
