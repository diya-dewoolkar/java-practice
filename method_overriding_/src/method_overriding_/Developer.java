package method_overriding_;

public class Developer extends Employee {
	@Override
	void calculateSalary() {
		System.out.println("the salary is 40000");
	}

}
