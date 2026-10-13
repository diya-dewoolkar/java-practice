package com.tka;

public class leap_year {
	public static void main(String Args[]) {
		int year=2005;
		if(year % 400==0||(year % 4==0 && year % 100 !=0)) {
			System.out.println("leap year");
		}else {
			System.out.println("not leap year");
		}
	}

}
