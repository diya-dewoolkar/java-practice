package polymorphism;

public class PrintDemo {

    static void print(int a) {
        System.out.println("Value: " + a);
    }

    static void print(int a, int b) {
        System.out.println("Values: " + a + " " + b);
    }

    public static void main(String[] args) {

        PrintDemo.print(10);

        PrintDemo.print(10, 20);
    }
}