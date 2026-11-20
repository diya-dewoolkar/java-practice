package method_overriding_;

public class upi extends Payment  {
	@Override
	void makePayment() {
		System.out.println("Payment done through upi");
	}
	

}
