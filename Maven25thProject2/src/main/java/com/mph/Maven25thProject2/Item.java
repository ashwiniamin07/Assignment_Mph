package com.mph.Maven25thProject2;

public class Item {
	private int id;
	private String itemName;
	private double itemcost;
	public Item(int id, String itemName, double itemcost) {
		super();
		this.id = id;
		this.itemName = itemName;
		this.itemcost = itemcost;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public double getItemcost() {
		return itemcost;
	}
	public void setItemcost(double itemcost) {
		this.itemcost = itemcost;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", itemName=" + itemName + ", itemcost=" + itemcost + "]";
	}
	
}
