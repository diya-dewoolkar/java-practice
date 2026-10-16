package do_while;

public class sum1to10 {
	public static void main(String[] args) {
		int i = 1;
		int sum = 0;

		do{
		    sum = sum + i;
		    i++;
		}while (i <= 10);

		System.out.println("Sum = " + sum);
	}

}
