package com.tka;

public class Employee {
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary){
		this.id=id;
		this.name =name;
		this.salary = salary;
	}

		
		void display() {
			System.out.println("employee id is "+id);
			System.out.println("employee name is  "+name);
			System.out.println("employee salary is "+salary);
			
		}
		
		
	}


