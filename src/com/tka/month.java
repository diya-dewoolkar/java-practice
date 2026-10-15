package com.tka;

public class month {
	public static void main(String args[]) {
		String month ="august";
		switch(month) {
		case "jan","feb","march","april":
			System.out.println("it's first quater");
		break;
		case "may","jun","july","august":
			System.out.println("it's second quater");
		break;
		case "septem","oct","nov","decem":
			System.out.println("it's third quater");
		break;
		default:
			System.out.println("Invallid");
		
		}
	}

}
