package com.mph.model;

public class Quiz {
	private int id;
    private String title;
    private int createdBy;
	public Quiz(int id, String title, int createdBy) {
		super();
		this.id = id;
		this.title = title;
		this.createdBy = createdBy;
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
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	@Override
	public String toString() {
		return "Quiz [id=" + id + ", title=" + title + ", createdBy=" + createdBy + "]";
	}
    
}
