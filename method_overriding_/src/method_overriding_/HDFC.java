package method_overriding_;

public class HDFC extends Bank {
	void getRateOfInterest() {
		System.out.println("the rate of interest is 8 %");
	}
	public static void main(String[] args) {
		Bank b = new SBI();
		b.getRateOfInterest();
		Bank c= new HDFC();
		c.getRateOfInterest();
		
	}

}
