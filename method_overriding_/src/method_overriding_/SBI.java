package method_overriding_;

public class SBI extends Bank{
	@Override
	void getRateOfInterest() {
		System.out.println("rate of interest is 8 %");
	}

}
