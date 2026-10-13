package com.tka;

public class student_marks_ {
	public static void main(String Args[]) {
		int marks=40;
		if(marks>=90 && marks<=100) {
			System.out.println("student got grade A");
			
		}else if(marks >=75 && marks<=89) {
			System.out.println("grade B");
			
		}else if(marks>=50 && marks<=74 ) {
			System.out.println("grade C");
			
		}else if(marks>=35 && marks<=49 ) {
			System.out.println("grade D");
			
		}else {
			System.out.println("student is failed better luck next time!!!");
		}
	}

}
