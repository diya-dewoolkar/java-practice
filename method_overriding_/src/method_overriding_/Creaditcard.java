package method_overriding_;

public class Creaditcard extends Payment{
	@Override
	void makePayment() {
		System.out.println("payement through creadit card");
		
		
	}
	public static void main(String[] args) {
		Payment p = new upi();
		p.makePayment();
		Payment r = new Creaditcard();
		r.makePayment();
	}

}
