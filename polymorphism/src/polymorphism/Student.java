package polymorphism;

public class Student {
	void display(String name) {
		System.out.println("studet name :"+name);
	}
	void display(String name,int age) {
		System.out.println("studentt age"+age);
		System.out.println("student name "+name);
	}
	public static void main(String[] args) {
		Student s = new Student();
		s.display("Diya");
		s.display("Diya",22);
	}

}
