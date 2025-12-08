package com.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		Configuration cfg=new Configuration().configure();
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
//		Course c=new Course(1,"Python",25000);
//		session.save(c);
//		System.out.println("Course added............");
//		Student s=new Student(2,"swapnaM",c,"8743172274","swapnam@gmailcom");
//		session.save(c);
//		System.out.println("Student added..");
		tx.commit();
		session.close();
		sessionFactory.close();

	}

}
