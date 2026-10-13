package com.tka;

public class triangle {
	public static void main (String Args[]) {
		int a=10;
		int b =10;
		int c =13;
		if(a==b && b==c) {
			System.out.println("It is equilateral triangle");
			
		}else if(a==b || b==c || c==a) {
			System.out.println("It is isosceles triangle");
		}else {
			System.out.println("it is scelene triangle");
		}
	}

}
