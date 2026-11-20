package method_overriding_;

public class cat extends Animal{
	@Override
	void makesound() {
		System.out.println("cat do meow");
	}
	public static void main(String[] args) {
		Animal a = new Dog();
		a.makesound();
		Animal b = new cat();
		b.makesound();
	}

}
