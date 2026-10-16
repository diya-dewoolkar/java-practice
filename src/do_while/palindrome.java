package do_while;

public class palindrome {
	public static void main(String[] args) {
		int num = 121;
		int original = num;
		int rev = 0;

		do
		{
		    int digit = num % 10;
		    rev = rev * 10 + digit;
		    num = num / 10;
		}
		while (num != 0);

		if (original == rev)
		{
		    System.out.println("Palindrome");
		}
		else
		{
		    System.out.println("Not Palindrome");
		}
	}

}
