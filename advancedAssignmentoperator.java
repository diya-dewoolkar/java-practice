
public class advancedAssignmentoperator {


	public static void main(String[] args) {

	    int a = 25;
	    int b = 6;

	    System.out.println("Initial a = " + a);
	    System.out.println("Initial b = " + b);

	    a += b++ + 2;
	    System.out.println("a += b++ + 2 : " + a);

	    a -= --b * 2;
	    System.out.println("a -= --b * 2 : " + a);

	    a *= b + 3;
	    System.out.println("a *= b + 3 : " + a);

	    a /= 4;
	    System.out.println("a /= 4 : " + a);

	    a %= 5;
	    System.out.println("a %= 5 : " + a);

	    a = 12;
	    a &= 10;
	    System.out.println("a &= 10 : " + a);

	    a = 12;
	    a |= 5;
	    System.out.println("a |= 5 : " + a);

	    a = 12;
	    a ^= 7;
	    System.out.println("a ^= 7 : " + a);

	    a = 7;
	    a <<= 3;
	    System.out.println("a <<= 3 : " + a);

	    a = 64;
	    a >>= 2;
	    System.out.println("a >>= 2 : " + a);

	    a = -16;
	    a >>>= 2;
	    System.out.println("a >>>= 2 : " + a);
	}

	}


