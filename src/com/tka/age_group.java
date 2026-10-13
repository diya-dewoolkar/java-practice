package com.tka;

public class age_group {
	public static void main (String Args[]) {
		int age =24;
		if(age<13) {
			System.out.println("child");
			
		}else if(age<20) {
			System.out.println("Teenager");
		}else if(age<60) {
			System.out.println("he is an adult");
		}else {
			System.out.println("he is seniour citizen");
		}
	}

}
