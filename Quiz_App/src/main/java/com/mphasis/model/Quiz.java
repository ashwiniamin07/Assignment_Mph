package com.mphasis.model;

public class Quiz {
	private int id;
	  private String title;
	  private String category;
	public Quiz(int id, String title, String category) {
		super();
		this.id = id;
		this.title = title;
		this.category = category;
	}
	public Quiz() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + ", category=" + category + "]";
	}
	
}
