package method_overriding_;

public class OnlineOrder extends Order {
		@Override
		void orderDetails() {
		System.out.println("order type: Online order");
	}
		@Override
		void calculateDeliveryCharge() {
			System.out.println("Delievery charge :40");
		}
		@Override
		void generateBill() {
			System.out.println("online payment successfully");
		}
		

}
