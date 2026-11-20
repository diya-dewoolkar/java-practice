package polymorphism;

public class Demo {

    void show(int id, String name) {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }

    void show(String name, int id) {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }

    public static void main(String[] args) {

        Demo d = new Demo();

        d.show(101, "Diya");

        d.show("Rahul", 102);
    }
}
