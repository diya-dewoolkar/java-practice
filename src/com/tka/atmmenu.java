package com.tka;

public class atmmenu {
	public static void main(String Args[]) {
	int choice =1;
	switch(choice) {
	case 1:
		System.out.println("check balance");
		break;
	case 2:
		System.out.println("withdraw");
		break;
	case 3:
		System.out.println("Deposite");
		break;
	case 4 :
		System.out.println("Exit");
		break;
		
		default:
			System.out.println("invallid choice");
	}

}
}
