package com.tka;

public class mobile_menu {
	public static void main(String Args[]) {
		int choice =8;
		switch(choice) {
		case 1:
			System.out.println("wifi");
			break;
		case 2 :
			System.out.println("bluetooth");
			break;
		case 3 :
			System.out.println("mobile data");
			break;
		case 4 :
			System.out.println("airoplane mode");
			break;
			default :
				System.out.println("Invallid choice");
		}
	}

}
