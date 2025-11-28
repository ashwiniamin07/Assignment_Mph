package com.mph.FilesRelatedProject;

import java.io.Serializable;

public class Bottle implements Serializable{
	private int bottleId;
	private String brand;
	private double cost;
	private String colour;
	public Bottle(int bottleId, String brand, double cost, String colour) {
		super();
		this.bottleId = bottleId;
		this.brand = brand;
		this.cost = cost;
		this.colour = colour;
	}
	public int getBottleId() {
		return bottleId;
	}
	public void setBottleId(int bottleId) {
		this.bottleId = bottleId;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	@Override
	public String toString() {
		return "Bottle [bottleId=" + bottleId + ", brand=" + brand + ", cost=" + cost + ", colour=" + colour + "]";
	}
	
	
}
