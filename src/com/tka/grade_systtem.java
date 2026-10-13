package com.tka;

public class grade_systtem {
	public static void main(String[] args) {

	    int marks = 15;

	    if (marks >= 40) {
	        if (marks >= 90) {
	            System.out.println("Grade A");
	        } else if (marks >= 75) {
	            System.out.println("Grade B");
	        } else {
	            System.out.println("Grade C - Pass");
	        }
	    } else {
	        System.out.println("Fail");
	    }
	}

	}


