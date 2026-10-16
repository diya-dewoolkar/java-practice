package do_while;

public class largest_digit {
	public static void main(String[] args) {
		int num = 5832;
		int max = 0;

		do
		{
		    int digit = num % 10;

		    if (digit > max)
		    {
		        max = digit;
		    }

		    num = num / 10;
		}
		while (num != 0);

		System.out.println("Largest digit = " + max);
	}

}
