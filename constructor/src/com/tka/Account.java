package com.tka;

public class Account {
	double balance;
	
	Account() {
		balance =1000;
	}
	
	Account(double balance){
		this.balance =balance;
	}
	void display() {
		System.out.println("account balance --->"+balance);
		
	}
	
	

}
