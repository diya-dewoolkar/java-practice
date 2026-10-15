package com.tka;

public class character_type{
    public static void main(String[] args) {
        char ch = 'A';

        switch (Character.getType(ch)) {
            case Character.UPPERCASE_LETTER:
                System.out.println("Uppercase");
                break;

            case Character.LOWERCASE_LETTER:
                System.out.println("Lowercase");
                break;

            case Character.DECIMAL_DIGIT_NUMBER:
                System.out.println("Digit");
                break;

            default:
                System.out.println("Special Character");
        }
    }
}