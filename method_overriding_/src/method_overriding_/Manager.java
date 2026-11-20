package method_overriding_;

public class Manager extends Employee {
	@Override
	void calculateSalary() {
		System.out.println("the salary is 60000");
	}
	public static void main(String[] args) {
		
	Employee e = new Developer();
	e.calculateSalary();
	Employee r = new Manager();
	r.calculateSalary();
}
	

}
