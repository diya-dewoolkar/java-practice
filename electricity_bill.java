package com.tka;

public class electricity_bill {
	public static void main (String Args[]) {
		int units =1200;
		int bill;
		
		if(units >=0 && units<=100) {
			bill =units * 5;
			
		}else if(units <=200 && units>100) {
			bill =units * 7;
		}else if(units > 200) {
			bill = units * 10;
		}else {
			System.out.println("Invallid units");
			return;
		}
		System.out.println("Units consumed = "+units);
		System.out.println("Electricity bill = "+bill);
	}

}
