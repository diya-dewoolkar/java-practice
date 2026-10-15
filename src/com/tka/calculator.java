package com.tka;

public class calculator {
	public static void main(String Args[]) {
		int a= 20;
		int b=60;
		char operator = '*';
		switch(operator) {
		case'+':
			System.out.println("addition ="+(a+b));
			break;
		case'-':
			System.out.println("subnstraction ="+(a-b));
			break;
		case'*':
			System.out.println("multiplication ="+(a*b));
			break;
		case'/':
			System.out.println("division ="+(a/b));
			break;
		case'%':
			System.out.println("mode ="+(a%b));
			break;
		default:
			System.out.println("This is invallid operator");
			break;
			
		}
		
	}

}
