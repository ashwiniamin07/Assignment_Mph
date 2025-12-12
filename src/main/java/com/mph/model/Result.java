package com.mph.model;

public class Result {
	private int id;
    private int userId;
    private int quizId;
    private int score;
	public Result(int id, int userId, int quizId, int score) {
		super();
		this.id = id;
		this.userId = userId;
		this.quizId = quizId;
		this.score = score;
	}
	public Result() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getQuizId() {
		return quizId;
	}
	public void setQuizId(int quizId) {
		this.quizId = quizId;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Result [id=" + id + ", userId=" + userId + ", quizId=" + quizId + ", score=" + score + "]";
	}
    
}
