package method_overriding_;

public class tester extends Employee_ {
	@Override
	void employeeDetails() {
		System.out.println("details contain employee");
	}
	@Override
	void calculateSalary() {
		System.out.println("contains salary of 30000");
	}
	@Override
	void calculateBonus() {
		System.out.println("contains salary of 3000");
	}

}
