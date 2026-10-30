package com.tka;

public class Car {
	String modelName;
	double price;
	
	Car(){
		System.out.println("car is started");
		
	}

	Car(String modelName,double price){
		this.modelName=modelName;
		this.price =price;
		
	}
	void display() {
		System.out.println("student id ------>"+modelName);
		System.out.println("student name ----->"+price);
	
	}
	}