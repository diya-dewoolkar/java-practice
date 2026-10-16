package while_loop;

public class largest_digit {
	public static void main(String[] args) {
		int num = 5832;
		int max = 0;

		while (num != 0){
		    int digit = num % 10;

		    if (digit > max){
		        max = digit;
		    }

		    num = num / 10;
		}

		System.out.println("Largest digit = " + max);
	}

}
