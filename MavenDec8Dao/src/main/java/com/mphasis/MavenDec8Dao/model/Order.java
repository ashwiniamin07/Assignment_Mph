package com.mphasis.MavenDec8Dao.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
@Entity
@Table(name="order_tab")
@NamedQueries({
    @NamedQuery(name="Order.findByDate", 
                query="FROM Order o WHERE o.orderDate = :dt"),

    @NamedQuery(name="Order.findByCostRange",
                query="FROM Order o WHERE o.cost BETWEEN :min AND :max")
})
public class Order {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@Temporal(TemporalType.DATE)
	private Date orderDate;
	private double cost;

	@ElementCollection(fetch = FetchType.EAGER)
	private List<String> items;
	public Order(int id, String name, Date orderDate, double cost, List<String> items) {
		super();
		this.id = id;
		this.name = name;
		this.orderDate = orderDate;
		this.cost = cost;
		this.items = items;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public List<String> getItems() {
		return items;
	}
	public void setItems(List<String> items) {
		this.items = items;
	}
	@Override
	public String toString() {
		return "Order [id=" + id + ", name=" + name + ", orderDate=" + orderDate + ", cost=" + cost + ", items=" + items
				+ "]";
	}
	
	
	
}
