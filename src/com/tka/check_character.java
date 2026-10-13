package com.tka;

public class check_character {
	public static void main (String Args[]) {
		char ch = '$';
		if(ch=='a'||ch=='e'||ch=='i'|| ch=='o'||ch=='u'||ch =='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {
			System.out.println("the given character is vowel");
			
		}else if((ch >='a' && ch <='z') || (ch >='A' && ch <='B')){
			System.out.println("the given character is alphabet");
			
		}else if(ch>='0' && ch<= '9') {
			System.out.println("The given character is digit");
			
		}else {
			System.out.println("special character");
		}
				
		
		
	}

}
