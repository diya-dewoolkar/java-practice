package do_while;

public class reverse_number {
	public static void main(String[] args) {
		int num = 1234;
		int rev = 0;

		do
		{
		    int digit = num % 10;
		    rev = rev * 10 + digit;
		    num = num / 10;
		}
		while (num != 0);

		System.out.println("Reverse = " + rev);
	}

}
