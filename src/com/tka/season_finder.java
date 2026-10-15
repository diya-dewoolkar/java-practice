package com.tka;

public class season_finder {
	public static void main(String[] args) {
		int month=1;
		
		switch(month) {
		case 12:
		case 1:
		case 2:
			System.out.println("winter");
			break;
		case 3 :
		case 4 :
		case 5 :
			System.out.println("summer");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("Monsoon");
			break;
			default:
				System.out.println("other season");
		}
	}

}
