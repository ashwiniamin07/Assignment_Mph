package com.mphasis.MavenDec8Hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mphasis.MavenDec8Hibernate.model.Student;
import com.mphasis.MavenDec8Hibernate.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		Session session=HibernateUtil.getSessionFactory().openSession();
		Transaction transaction=session.beginTransaction();
		
		
		
		
		
//		//addStudent
//		session.save(new Student(140,"PrathithChandra","Data Structures1")) ;
//		session.save(new Student(141,"Shivani","Java"));
//		session.save(new Student(142,"Shekhar","C"));
//		session.save(new Student(143,"Sheela","Python"));
		
		//getAllStudents()
		List<Student> studList=session.createQuery("From Student",Student.class).list();
		studList.forEach(System.out::println);
		
		System.out.println("Student list with java course ");
		Query<Student> q1=session.createQuery("From Student where course=:c");
		q1.setParameter("c", "Java");
		q1.list().forEach(System.out::println);
		
		//getAllStudents where name starts with a
		Query<Student> q2=session.createQuery("From Student where sname like 'a%'");
		q2.list().forEach(System.out::println);
		
		//get only id and name
		studList.forEach(s->System.out.println(s.getSid()+" "+s.getSname()));
		
		// count number of unique records
		Query<Student> q3=session.createQuery("select count(*) from Student");
		System.out.println(q3.uniqueResult());
		
		//count number of students in each course
		Query<Object[]> q4=session.createQuery("select course,count(course) from Student group by course");
		q4.list().forEach(s->System.out.println(s[0]+" "+s[1]));
		
		//using named query
		Query<Student> q5=session.createNamedQuery("Student.findAll",Student.class);
		System.out.println("------------------Using named query--------------");
		q5.list().forEach(System.out::println);
		
		System.out.println("-----------------Find course using named query-------------------");
		Query<Student> q6=session.createNamedQuery("Student.findByCourse",Student.class);
		q6.setParameter("course", "spring");
		q6.list().forEach(System.out::println);
		
		System.out.println("-----------------Count students using named query-------------------");
		Query<Long> q7=session.createNamedQuery("Student.count",Long.class);
		System.out.println(q7.uniqueResult());
		
		System.out.println("----------------Count of Students in each course using Named query-------------------");
		Query<Object[]> q8=session.createNamedQuery("Student.groupByCourse",Object[].class);
		q8.list().forEach(s->System.out.println(s[0]+" "+s[1]));
		
		transaction.commit();
		session.close();
		
		
		
		
		

	}

}
