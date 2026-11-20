package method_overriding_;

public class manager_ extends Employee_{
	@Override
	void employeeDetails() {
		System.out.println("contains info of manager");
	}
	@Override
	void calculateSalary() {
		System.out.println("contains salary 60000");
	}
	@Override
	void calculateBonus() {
		System.out.println("contains bonus 10000");
	}
	public static void main(String[] args) {
		Employee r = new Developer();
		 r.employeeDetails();
		 r.calculateSalary();
		 r.calculateBonus();

	}

}
