package com.mphasis;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.mphasis.entities.Item;
import com.mphasis.utils.HibernateUtil;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Session session1=HibernateUtil.buildSessionFactory().openSession();
//        Session session2=HibernateUtil.buildSessionFactory().openSession();
//        Session session3=HibernateUtil.buildSessionFactory().openSession();
        
        Item i1=new Item("Laptop",700000.00);
        Transaction t=session1.beginTransaction();
        session1.save(i1);
        t.commit();
        session1.close();
        
        //session2.get("Item.class", t)
    }
}
