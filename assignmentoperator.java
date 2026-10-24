public class assignmentoperator {

	    public static void main(String[] args) {

	        int a = 20;

	        System.out.println("Initial value of a = " + a);

	        a += 5;
	        System.out.println("a += 5  : " + a);

	        a -= 3;
	        System.out.println("a -= 3  : " + a);

	        a *= 2;
	        System.out.println("a *= 2  : " + a);

	        a /= 4;
	        System.out.println("a /= 4  : " + a);

	        a %= 3;
	        System.out.println("a %= 3  : " + a);

	        a = 10;
	        a &= 6;
	        System.out.println("a &= 6  : " + a);

	        a = 10;
	        a |= 6;
	        System.out.println("a |= 6  : " + a);

	        a = 10;
	        a ^= 6;
	        System.out.println("a ^= 6  : " + a);

	        a = 10;
	        a <<= 2;
	        System.out.println("a <<= 2 : " + a);

	        a = 10;
	        a >>= 2;
	        System.out.println("a >>= 2 : " + a);

	        a = -10;
	        a >>>= 2;
	        System.out.println("a >>>= 2: " + a);
	    
	}

}
