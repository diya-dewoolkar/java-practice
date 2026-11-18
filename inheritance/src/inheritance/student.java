package inheritance;

public class student extends person{
	String course ="Java";
	void display() {
		System.out.println("Name :"+name);
		System.out.println("Age"+age);
		System.out.println("course:"+course);
	}

}
