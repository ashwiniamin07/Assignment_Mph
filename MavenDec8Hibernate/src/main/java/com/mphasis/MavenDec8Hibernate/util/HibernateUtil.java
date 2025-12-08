package com.mphasis.MavenDec8Hibernate.util;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	private static SessionFactory sessionFactory=buildSessionFactory();
	
	public static SessionFactory buildSessionFactory() {
		try {
//		Configuration cfg=new Configuration().configure();
//		cfg.addAnnotatedClass(com.mphasis.MavenDec8Hibernate.model.Student.class);
//		cfg.setProperty("hibernate.connection.driver_class", System.getProperty("hibernate.connection.driver_class"));
//		cfg.setProperty("hibernate.connection.url", System.getProperty("hibernate.connection.url"));
//		cfg.setProperty("hibernate.connection.username", System.getProperty("hibernate.connection.username"));
//		cfg.setProperty("hibernate.connection.password", System.getProperty("hibernate.connection.password"));
//		cfg.setProperty("hibernate.dialect", System.getProperty("hibernate.dialect"));
//		cfg.setProperty("hibernate.hbm2ddl.auto", System.getProperty("hibernate.hbm2ddl.auto"));
//		cfg.setProperty("hibernate.show_sql", System.getProperty("hibernate.show_sql"));
		
			
		Properties props=new Properties();
		props.load(HibernateUtil.class.getClassLoader().getResourceAsStream("application.properties"));
		Configuration cfg=new Configuration();
		cfg.setProperties(props);
		cfg.addAnnotatedClass(com.mphasis.MavenDec8Hibernate.model.Student.class);
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties());
		return cfg.buildSessionFactory(builder.build());
		}catch(Exception e) {
			throw new ExceptionInInitializerError();
		}
	}
	
	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
