package while_loop;

public class odd_sum1to10 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		while (i <= 10)
		{
		    sum = sum + i;
		    i = i + 2;
		}

		System.out.println("Sum = " + sum);
	}

}
