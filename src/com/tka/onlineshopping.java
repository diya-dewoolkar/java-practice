package com.tka;

public class onlineshopping {

    public static void main(String[] args) {

        int amount = 2000;
        String membership = "yes";
        double discount;

        if (amount > 1000) {
            if (membership.equals("yes")) {
                discount = amount * 0.20;
            } else {
                discount = amount * 0.10;
            }
        } else {
            discount = 0;
        }

        System.out.println("Discount = Rs. " + discount);
        System.out.println("Final Amount = Rs. " + (amount - discount));
    }
}