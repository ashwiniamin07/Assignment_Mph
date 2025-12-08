package com.mphasis.MavenDec8Dao;




import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import com.mphasis.MavenDec8Dao.DAO.OrderDao;
import com.mphasis.MavenDec8Dao.model.Order;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws ParseException {
    	OrderDao dao = new OrderDao();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date  dt = sdf.parse("2025-02-10");

        // Add order
//        Order o = new Order(3,"Computer Order", dt, 56000,
//                Arrays.asList("Computer", "Bag", "Mouse"));
//        dao.addOrder(o);

        // Find all
        System.out.println("Finding all orders");
        dao.findAll().forEach(System.out::println);

        // Find by date
        System.out.println("Finding by order date");
       dao.findByDate(dt).forEach(System.out::println);
//
//        // Find by cost range
       System.out.println("Finding by cost range");
       dao.findByCostRange(10000, 60000).forEach(System.out::println);
//
//        // Criteria: date + min cost
       System.out.println("Finding by date and minimum cost");
       dao.findByDateAndMinCost(dt, 30000).forEach(System.out::println);
//
//        // Print items of order id
       System.out.println("Finding by order Id");
        dao.getItemsByOrderId(1).forEach(System.out::println);
    }
}
