package polymorphism;

public class calculator {
	void add(int a,int b) {
		System.out.println("Addition of two iintegers"+(a+b));
		
	}
	void add(int a,int b,int c) {
		System.out.println("Addition of three integers :"+(a+b+c));
		
	}
	public static void main(String[] args) {
		calculator c = new calculator();
		c.add(10,20);
		c.add(10,20,30);
	}

}
