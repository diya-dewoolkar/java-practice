package method_overriding_;

public class Child extends Parent {
	void show() {
		System.out.println("child");
	}
	public static void main(String[] args) {
		Parent p =new Child();
		p.show();
	}

}
