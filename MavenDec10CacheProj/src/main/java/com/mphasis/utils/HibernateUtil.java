package com.mphasis.utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;



public class HibernateUtil {
private static SessionFactory sessionFactory=buildSessionFactory();
	
	public static SessionFactory buildSessionFactory() {
		try {

			
		Properties props=new Properties();
		props.load(HibernateUtil.class.getClassLoader().getResourceAsStream("application.properties"));
		Configuration cfg=new Configuration();
		cfg.setProperties(props);
		cfg.addAnnotatedClass(com.mphasis.entities.Item.class);
		
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
