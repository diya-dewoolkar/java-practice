package com.tka;

public class vowel {
	public static void main(String[] args) {
		char ch ='a';
		
		if(ch=='a'|| ch== 'e'|| ch== 'i'|| ch=='o'|| ch=='u'|| ch=='A'||
				ch=='E'|| ch=='I'||ch=='o'||ch=='U'){
			System.out.println("Character is a vowel");
			
		}else if((ch >='a'&& ch<='z')||(ch >='A' && ch<='Z')){
			System.out.println("Character is a consonant");
		}else {
			System.out.println("Character is not alphabet");
		}
	}

}
