package com.mphasis.MavenDec8Dao.DAO;

import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.mphasis.MavenDec8Dao.model.Order;
import com.mphasis.MavenDec8Dao.util.HibernateUtil;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;

public class OrderDao implements OrderDaoInterface{

	@Override
	public void addOrder(Order order) {
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction tx = session.beginTransaction();
	        session.save(order);
	        tx.commit();
	        session.close();
		
	}

	@Override
	public Order findById(int id) {
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        Order o = session.get(Order.class, id);
	        session.close();
	        return o;
	}

	@Override
	public List<Order> findAll() {
		Session session = HibernateUtil.getSessionFactory().openSession();
        List<Order> list = session.createQuery("FROM Order", Order.class).list();
        session.close();
        return list;
	}

	@Override
	public Order updateOrder(int id, Order newOrder) {
	     Session session = HibernateUtil.getSessionFactory().openSession();
	        Transaction tx = session.beginTransaction();

	        Order o = session.get(Order.class, id);
	        if (o != null) {
	            o.setName(newOrder.getName());
	            o.setOrderDate(newOrder.getOrderDate());
	            o.setCost(newOrder.getCost());
	            o.setItems(newOrder.getItems());
	            session.update(o);
	        }

	        tx.commit();
	        session.close();
	        return o;
	}

	@Override
	public void deleteOrder(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        Order o = session.get(Order.class, id);
        if (o != null)
            session.delete(o);

        tx.commit();
        session.close();
		
	}

	@Override
	public List<Order> findByDate(Date date) {
		 Session session = HibernateUtil.getSessionFactory().openSession();
	        Query<Order> q = session.createNamedQuery("Order.findByDate", Order.class);
	        q.setParameter("dt", date);
	        List<Order> list = q.list();
	        session.close();
	        return list;
	}

	@Override
	public List<Order> findByCostRange(double min, double max) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Query<Order> q = session.createNamedQuery("Order.findByCostRange", Order.class);
        q.setParameter("min", min);
        q.setParameter("max", max);
        List<Order> list = q.list();
        session.close();
        return list;
	}

	@Override
	public List<Order> findByDateAndMinCost(Date date, double minCost) {
		Session session = HibernateUtil.getSessionFactory().openSession();

        CriteriaBuilder cb = session.getCriteriaBuilder();
        CriteriaQuery<Order> cq = cb.createQuery(Order.class);
        Root<Order> root = cq.from(Order.class);

        Predicate p1 = cb.equal(root.get("orderDate"), date);
        Predicate p2 = cb.greaterThanOrEqualTo(root.get("cost"), minCost);

        cq.where(cb.and(p1, p2));

        List<Order> list = session.createQuery(cq).getResultList();
        session.close();
        return list;
	}

	@Override
	public List<String> getItemsByOrderId(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
        Order o = session.get(Order.class, id);
        List<String> items = o != null ? o.getItems() : null;
        session.close();
        return items;
	}

}
