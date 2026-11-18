package inheritance;

public class Teacher extends person {
	String subject ="java programming";
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Age"+age);
		System.out.println("subject "+subject);
	}

}
