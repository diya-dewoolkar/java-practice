package polymorphism;

public class display {
	void display(int a) {
		System.out.println("Integer value:"+a);
	}
	void display(String name) {
		System.out.println("String value"+name);
	}
	public static void main(String[] args) {
		display d = new display();
		d.display(100);
		d.display("Diya");
	}
}
