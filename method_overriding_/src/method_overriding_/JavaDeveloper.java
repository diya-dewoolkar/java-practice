package method_overriding_;

public class JavaDeveloper extends D {
	@Override
	void calculateSalary() {
		System.out.println("java developer salary is 50000");
	}
	public static void main(String[] args) {
		
	
		Employee e = new Employee();
		D d = new JavaDeveloper();
		JavaDeveloper j = new JavaDeveloper();
		e.calculateSalary();
		d.calculateSalary();
		j.calculateSalary();
		
	}


}
