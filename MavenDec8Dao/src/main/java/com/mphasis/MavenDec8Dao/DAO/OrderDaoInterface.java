package com.mphasis.MavenDec8Dao.DAO;

import java.util.Date;
import java.util.List;

import com.mphasis.MavenDec8Dao.model.Order;

public interface OrderDaoInterface {
	 void addOrder(Order order);

	    Order findById(int id);

	    List<Order> findAll();

	    Order updateOrder(int id, Order newOrder);

	    void deleteOrder(int id);

	    List<Order> findByDate(Date date);

	    List<Order> findByCostRange(double min, double max);

	    List<Order> findByDateAndMinCost(Date date, double minCost);

	    List<String> getItemsByOrderId(int id);
}
