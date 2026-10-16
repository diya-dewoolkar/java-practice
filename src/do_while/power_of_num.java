package do_while;

public class power_of_num {
	public static void main(String[] args) {
		int base = 2;
		int power = 4;
		int i = 1;
		int result = 1;

		do
		{
		    result = result * base;
		    i++;
		}
		while (i <= power);

		System.out.println("Result = " + result);
	}

}
