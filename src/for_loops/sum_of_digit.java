package for_loops;
//sum of digits in number -->--1234=1+2+3+4

public class sum_of_digit {
	public static void main(String Args[]) {
		int num=1234;
		int sum =0;
		
		for(; num!=0;num=num%10) {
			int digit =num%10;
			sum =sum + digit;
			
		}
		System.out.println("sum of digits =" +sum);
	}

}
