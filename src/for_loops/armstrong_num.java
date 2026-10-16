package for_loops;

	public class armstrong_num{
	
	    public static void main(String[] args)
	    {
	        int num = 153;
	        int original = num;
	        int sum = 0;
	        int digits = 0;

	        for (int temp = num; temp != 0; temp = temp / 10)
	        {
	            digits++;
	        }

	        for (int temp = num; temp != 0; temp = temp / 10)
	        {
	            int digit = temp % 10;
	            int power = 1;

	            for (int i = 1; i <= digits; i++)
	            {
	                power = power * digit;
	            }

	            sum = sum + power;
	        }

	        if (sum == original)
	        {
	            System.out.println("Armstrong number");
	        }
	        else
	        {
	            System.out.println("Not an Armstrong number");
	        }
	    }
	}

