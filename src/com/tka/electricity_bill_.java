package com.tka;

public class electricity_bill_ {
	public static void main(String Args[]) {
		int units =150;
		int bill;
		if(units <= 100) {
			bill =units*5;
				
		}else if(units <=200) {
			bill = units * 7;
			
		}else {
			bill=units*10;
		}
		System.out.println("Electricity Bill = Rs."+bill);
	}

}
