package do_while;

public class factorialof5 {
	public static void main(String[] args) {
		int i = 1;
		int fact = 1;

		do
		{
		    fact = fact * i;
		    i++;
		}
		while (i <= 5);

		System.out.println("Factorial = " + fact);
	}

}
