package com.klef.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Insert {
	
	public static void main(String args[]) {
		
		 Configuration cfg=new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 
		 SessionFactory sfg=cfg.buildSessionFactory();
		 Session session=sfg.openSession();
		 
		 Student student=new Student();
		 
		 student.setId(103);
		 student.setName("SAI KUMAR");
		 student.setAge(19);
		 student.setDepartment("IT");
		 student.setGender("MALE");
		 
		 Transaction txt=session.beginTransaction();
		 session.save(student);
		 txt.commit();
		 
		 System.out.println("object saved successfully");
//		 session.close();
//		 sfg.close();
		
		
		
	}

}
