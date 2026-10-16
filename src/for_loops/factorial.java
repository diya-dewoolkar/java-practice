package for_loops;

public class factorial {
	public static void main (String Args[]) {
		int num=5;
		int fact=1;
		
		for(int i=1;i<=num;i++)
		{
			fact =fact*i;
		}
		System.out.println("Factorial ="+fact);
	}
}
