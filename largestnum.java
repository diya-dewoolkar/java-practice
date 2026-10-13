package com.tka;

public class largestnum {
	public static void main(String Args[]) { 
	int a=10;
	int b=90;
	int c=40;
	if(a>b && a>c ) {
		System.out.println("a is the largest number");
		
	}else if(b>a && b>c) {
		System.out.println("b is the largest number");
		
	}else if(c>a && c>b) {
		System.out.println(" c is the largest number");
	}else {
		System.out.println("all three numbers are equal");
	}
}
}
