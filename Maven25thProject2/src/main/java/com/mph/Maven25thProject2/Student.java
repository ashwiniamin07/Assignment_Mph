package com.mph.Maven25thProject2;

public class Student {

	
		private int id;
		private String name;
		private String course;
		
		public Student(int id, String name, String course) {
			super();
			this.id = id;
			this.name = name;
			this.course = course;
		}
		
		public int getId() {
			return id;
		}

		public String getName() {
			return name;
		}

		public String getCourse() {
			return course;
		}

		@Override
		public String toString() {
			return "Student [id=" + id + ", name=" + name + ", course=" + course + "]";
		}
		
	

}
