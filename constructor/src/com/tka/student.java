package com.tka;

public class student {
	int id;
	String name;
		student(){
			System.out.println("welcome student");
		}

	    student(int id, String name) {
	        this.id = id;
	        this.name = name;
	    }	
		
		void display() {
			System.out.println("student id ------>"+id);
			System.out.println("student name ----->"+name);
		}
		
		
		
	}


