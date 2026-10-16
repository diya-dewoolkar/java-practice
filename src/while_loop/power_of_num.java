package while_loop;

public class power_of_num {
	public static void main(String[] args) {
		int base = 2;
		int power = 4;
		int i = 1;
		int result = 1;

		while (i <= power){
		    result = result * base;
		    i++;
		}

		System.out.println("Result = " + result);
	}

}
