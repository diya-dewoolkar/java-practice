package do_while;

public class digitnumber {
	public static void main(String[] args) {
		
	int num = 12345;
	int count = 0;

	do
	{
	    count++;
	    num = num / 10;
	}
	while (num != 0);

	System.out.println("Count = " + count);

}
}