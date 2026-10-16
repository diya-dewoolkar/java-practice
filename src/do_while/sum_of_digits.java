package do_while;

public class sum_of_digits {
	public static void main(String[] args) {
		int num = 1234;
		int sum = 0;

		do
		{
		    int digit = num % 10;
		    sum = sum + digit;
		    num = num / 10;
		}
		while (num != 0);

		System.out.println("Sum = " + sum);
	}

}
