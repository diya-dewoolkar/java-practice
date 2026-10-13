package com.tka;

public class ticket_price {

    public static void main(String[] args) {

        int age = 65;

        if (age >= 18) {
            if (age >= 60) {
                System.out.println("Senior discount");
            } else {
                System.out.println("Normal price");
            }
        } else {
            System.out.println("Child ticket");
        }
    }
}