package com.klef.demo;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update {

	public static void main(String[] args) {

		
		 Configuration cfg=new Configuration();
		 cfg.configure("hibernate.cfg.xml");
		 
		 SessionFactory sfg=cfg.buildSessionFactory();
		 Session session=sfg.openSession();

		 Query qry1=session.createQuery("update Student set name='Arigala Suhas',gender='male' where id=101");
			int n1=qry1.executeUpdate();
			System.out.println(n1+" record updated");
			
			Transaction txt=session.beginTransaction();
			txt.commit();

	}

}
