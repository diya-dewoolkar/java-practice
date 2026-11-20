package method_overriding_;

public class Express_order extends Order {
	@Override
	void orderDetails() {
		System.out.println("emergency patient details");
		
	}
	@Override
	void calculateDeliveryCharge(){
		System.out.println("Delievery charges : 80");
	}
	@Override
	void generateBill() {
		System.out.println("this is express delievery");
	}
	public static void main(String[] args) {
		Order o = new OnlineOrder();
		o.orderDetails();
		o.calculateDeliveryCharge();
		o.generateBill();
		
		Order n = new CashOnDelievery();
		n.orderDetails();
		n.calculateDeliveryCharge();
		n.generateBill();
		
		Order p = new  Express_order();
		p.orderDetails();
		p.calculateDeliveryCharge();
		p.generateBill();
		
		
		
	}

}
