package methods;

public class reversenum {
		static void reversenum() {
			int num=4567;
			int rev =0;
			do {
				int digit=num%10;
				rev= rev * 10 + digit;
				num=num/10;
				
			}
			while(num != 0);
			System.out.println("the reverse no. is ----->"+rev);
			
		}


	
	}
