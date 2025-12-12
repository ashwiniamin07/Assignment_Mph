package com.mph.model;

public class Question {
	 private int id;
	    private int quizId;
	    private String question;
	    private String optionA, optionB, optionC, optionD;
	    private String correctAns;
		public Question(int id, int quizId, String question, String optionA, String optionB, String optionC,
				String optionD, String correctAns) {
			super();
			this.id = id;
			this.quizId = quizId;
			this.question = question;
			this.optionA = optionA;
			this.optionB = optionB;
			this.optionC = optionC;
			this.optionD = optionD;
			this.correctAns = correctAns;
		}
		public Question() {
			super();
			// TODO Auto-generated constructor stub
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getQuizId() {
			return quizId;
		}
		public void setQuizId(int quizId) {
			this.quizId = quizId;
		}
		public String getQuestion() {
			return question;
		}
		public void setQuestion(String question) {
			this.question = question;
		}
		public String getOptionA() {
			return optionA;
		}
		public void setOptionA(String optionA) {
			this.optionA = optionA;
		}
		public String getOptionB() {
			return optionB;
		}
		public void setOptionB(String optionB) {
			this.optionB = optionB;
		}
		public String getOptionC() {
			return optionC;
		}
		public void setOptionC(String optionC) {
			this.optionC = optionC;
		}
		public String getOptionD() {
			return optionD;
		}
		public void setOptionD(String optionD) {
			this.optionD = optionD;
		}
		public String getCorrectAns() {
			return correctAns;
		}
		public void setCorrectAns(String correctAns) {
			this.correctAns = correctAns;
		}
		@Override
		public String toString() {
			return "Question [id=" + id + ", quizId=" + quizId + ", question=" + question + ", optionA=" + optionA
					+ ", optionB=" + optionB + ", optionC=" + optionC + ", optionD=" + optionD + ", correctAns="
					+ correctAns + "]";
		}
	    
}
