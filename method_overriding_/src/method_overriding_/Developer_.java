package method_overriding_;

public class Developer_  extends Employee_{
	@Override
	void employeeDetails() {
		System.out.println("this is developer");
	}
	@Override
	void calculateSalary() {
		System.out.println("salary is 40000");
	}
	@Override
	void calculateBonus() {
		System.out.println("bonus is 5000");
	}
}
