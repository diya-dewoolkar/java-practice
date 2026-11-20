package polymorphism;

public class details {
	void details(String name) {

        System.out.println("Name: " + name);
    }

    void details(String name, int age) {

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {

        details d = new details();

        d.details("Diya");

        d.details("Diya", 22);
    }
}


