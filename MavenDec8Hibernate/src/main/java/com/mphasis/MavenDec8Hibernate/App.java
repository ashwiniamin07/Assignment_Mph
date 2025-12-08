package com.mphasis.MavenDec8Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.mphasis.MavenDec8Hibernate.model.Student;
import com.mphasis.MavenDec8Hibernate.util.HibernateUtil;


public class App {
    public static void main(String[] args) {
       SessionFactory factory=HibernateUtil.getSessionFactory();
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
       Student s=new Student(128,"Prathith","Data Structures");
       session.save(s);
       System.out.println("object added successfully..");
       tx.commit();
       
       //retrieve all students
       
       List<Student> studList=session.createQuery("From Student",Student.class).list();
       for(Student s1:studList)
    	   System.out.println(s1);
       
       //update
       Session session1=factory.openSession();
       Transaction tx1=session.beginTransaction();
       String update = "update Student set sname='Amit Achar', course='Python' where sid=125";
       session.createQuery(update).executeUpdate();
       tx1.commit();
       
       //delete
       Session session2 = factory.openSession();
       Transaction tx2 = session.beginTransaction(); 

       String hql = "delete from Student where sid=125";
       session.createQuery(hql).executeUpdate();
       tx2.commit();
       
       session.close();
       factory.close();
    }
}
