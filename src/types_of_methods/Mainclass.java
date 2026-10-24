
package types_of_methods;

public class Mainclass {

    public static void main(String[] args) {

        thirty_problems obj = new thirty_problems();

        System.out.println("1. Addition = " + obj.calculate(10, 20));

        System.out.println("2. Subtraction = " + obj.calculate(20, 5, 3));

        System.out.println("3. Square = " + obj.calculate(5));

        System.out.println("4. Division = " + obj.calculate(20.0, 4.0));

        System.out.println("5. Remainder = " + obj.calculate(10, 3, 0, 0));

        System.out.println("6. Cube = " + obj.calculate(3, 0, 0, 0, 0));

        System.out.println("7. Double addition = " + obj.calculate(1.5, 2.5, 3.0));

        System.out.println("8. Float addition = " + obj.calculate(2.5f, 3.5f));

        System.out.println("9. Long addition = " + obj.calculate(100L, 200L));

        System.out.println("10. Greater = " + obj.calculate(10, 20, true));

        System.out.println("11. Smaller = " + obj.calculate(10, 20, 's'));

        System.out.println("12. Even/Odd (0 even, 1 odd) = " + obj.calculate(8, true));

        System.out.println("13. Sign (1 positive, -1 negative, 0 zero) = "
                + obj.calculate(-5, 's'));

        System.out.println("14. Absolute value = " + obj.calculate(-15, (short) 1));

        System.out.println("15. Sum of natural numbers = "
                + obj.calculate(10, (byte) 1));

        System.out.println("16. Factorial = " + obj.calculate(5, 1L));

        System.out.println("17. Reverse = " + obj.calculate(1234, 1.0f));

        System.out.println("18. Sum of digits = " + obj.calculate(1234, 1.0));

        System.out.println("19. Count digits = " + obj.calculate(12345, "count"));

        System.out.println("20. Palindrome = "
                + obj.calculate(121, "palindrome", true));

        System.out.println("21. Prime = " + obj.calculate(7, "prime", 0));

        System.out.println("22. Maximum = " + obj.calculate(10, 20, 30, true));

        System.out.println("23. Minimum = " + obj.calculate(10, 20, 30, 'm'));

        System.out.println("24. Double square = " + obj.calculate(2.5, 1));

        System.out.println("25. Simple interest = "
                + obj.calculate(1000.0, 5.0, 2.0, 1));

        System.out.println("26. Character value = " + obj.calculate('A'));

        System.out.println("27. Integer to double = "
                + obj.calculate(10, 1.0, true));

        System.out.println("29. Rectangle area = "
                + obj.calculate(5, 4, "rectangle"));

        System.out.println("30. Circle area = "
                + obj.calculate(5.0, "circle"));
    }
}
