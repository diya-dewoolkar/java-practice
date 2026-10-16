package for_loops;
//for counting-->digit in number

public class countdigitin_num {
	public static void main(String[] args)
	{
		int num =12345;
		int count=0;
		
		for( ; num!=0;num=num/10)
		{
			count++;
			
		}
		System.out.println("Total digits ="+ count);
	}
}
	
