package methods;

public class palindrome {
	    static void palindrome() {
	        int num = 121;
	        int original = num;
	        int rev = 0;

	        while (num > 0) {
	            int digit = num % 10;
	            rev = rev * 10 + digit;
	            num = num / 10;
	        }

	        if (original == rev) {
	            System.out.println("Palindrome");
	        } else {
	            System.out.println("Not Palindrome");
	        }
	    }

}