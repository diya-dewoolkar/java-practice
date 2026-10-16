package for_loops;

public class reverse_number {
	public static void main(String Args[]) {
		int num =1234;
		int rev =0;
		for(; num!=0;num=num /10) {
			int digit =num % 10;
			rev =rev * 10 + digit;
		}
		System.out.println("Reverse number ="+ rev);
		
	}

}
