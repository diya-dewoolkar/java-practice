package polymorphism;

import java.security.DomainCombiner;

public class multiply {
	void multiply(int a,int b) {
		System.out.println("multiplicationn of two integers:"+(a*b));
	}
		void multiply(double a,double b) {
			System.out.println("{multiplication of two double values "+(a*b));
				
			}
			public static void main (String[] args) {
				multiply m = new multiply();
				m.multiply(10,20);
				m.multiply(10.5,2.5);
				
			}
	

}
