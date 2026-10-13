package com.tka;

public class atmwithdrawl {
	public static void main(String Args[]) {
		int balance =5000;
		int amount =1000;
	if(balance >=amount) {
		if(amount % 100==0) {
			System.out.println("withdrawl successfull");
			}else {
				System.out.println("invallid denomination");
			}
				
				
		
	       }else {
				System.out.println("insufficient balance");
			}
			
		}
		
	}


