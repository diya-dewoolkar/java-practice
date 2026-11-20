package method_overriding_;

public class CashOnDelievery extends Order{
	@Override
	void orderDetails() {
		System.out.println("order type :cash on delievery");
		
	}
	@Override
	void calculateDeliveryCharge() {
		System.out.println("Delievery charge :60");
	}
	@Override
	void generateBill() {
		System.out.println("pay amount at delieveryyyyy");
	}
	

}
