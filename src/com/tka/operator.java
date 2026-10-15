package com.tka;

public class operator {
	public static void main(String Args[]) {
		int a= 40;
		int b=20;
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
		default:
			System.out.println("This is invallid operator");
			break;
			
		}
		
	}

}



