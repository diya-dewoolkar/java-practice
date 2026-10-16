package for_loops;

public class palindrome_check 
{
	public static void main(String Args[]) {
		int num=121;
		int original =num;
		int reverse =0;
		 for (; num != 0; num = num / 10)
	        {
	            int digit = num % 10;
	            reverse = reverse * 10 + digit;
	        }

	        if (original == reverse)
	        {
	            System.out.println("Palindrome number");
	        }
	        else
	        {
	            System.out.println("Not a palindrome number");
	        }
	    }
	
	}


