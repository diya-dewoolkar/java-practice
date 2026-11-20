package polymorphism;

public class ReturnTypeDemo {

    int add(int a, int b) {

        return a + b;
    }

    public static void main(String[] args) {

        ReturnTypeDemo r = new ReturnTypeDemo();

        System.out.println("Addition: " + r.add(10, 20));
    }
}