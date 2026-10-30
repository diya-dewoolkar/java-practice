package com.tka;

public class Rectangle {
	int length;
	int width;
	Rectangle(){
		length=10;
		width=5;
	}
	Rectangle(int length,int width){
		this.length=length;
		this.width =width;
		
	}
	void area() {
		System.out.println("The area of rectangle is ---->"+(length*width) );
	}

}
