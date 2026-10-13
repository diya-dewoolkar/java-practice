package com.tka;

public class grademarks {
	public static void main(String args[]) {
		int marks =38;
		if(marks>=75) {
			System.out.println("distinction");
		}else if(marks >=60) {
			System.out.println("First class");
		}else if(marks>= 50) {
			System.out.println("second class");
		}else if(marks>= 35) {
			System.out.println("pass");
		}else {
			System.out.println("fail");
		}
	}

}
