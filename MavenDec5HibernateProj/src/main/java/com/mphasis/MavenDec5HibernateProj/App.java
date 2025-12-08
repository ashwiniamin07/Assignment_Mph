package com.mphasis.MavenDec5HibernateProj;




import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.model.Course;
import com.model.Student;

public class App {
    public static void main(String[] args) {
       Configuration cfg=new Configuration().configure();
       SessionFactory factory=cfg.buildSessionFactory();
       Session session=factory.openSession();
       Transaction tx=session.beginTransaction();
//       Student s=new Student(123,"anvitha","python","9995132529","anvitha@gmail.com");
//       session.save(s);
//       tx.commit();
//       Student s=session.get(Student.class, 1);
//       System.out.println(s);
       
//       List<Student> studentList=session.createQuery("From S-tudent",Student.class).list();
//       for(Student s1:studentList)
//    	   System.out.println(s1);
       
       //update Student
//       Student s=session.get(Student.class, 3);
//       if(s!=null) {
//    	   s.setMobile("898989898");
//    	   s.setStudName("Swapna Motupally");
//    	   s.setEmail("swapna@gmail.com");
//    	   s.setCourse("Spring");
//    	   session.update(s);
//       }
//       else
//    	   System.out.println("no student with this id");
       
       //deletion
//       Student s=session.get(Student.class, 3);
//       if(s!=null) {
//    	   session.delete(s);
//    	   System.out.println("student deleted");
//       }
//       else
//    	   System.out.println("no student with this id");
//                                                                                                            
//       tx.commit();
         
       List<Student> studentList=session.createQuery("From Student",Student.class).list();
       for(Student s1:studentList)
  	   System.out.println(s1);
       
//       Course c=new Course(1,"java",25000);
//       session.save(c);
//       System.out.println("course inserted successfully");
//       tx.commit();
       
       List<Course> courseList=session.createQuery("From Course",Course.class).list();
       for(Course c1:courseList)
  	   System.out.println(c1);
       
       
       
       session.close();
       factory.close();
      //System.out.println("record added successfully");
       
    }
}
