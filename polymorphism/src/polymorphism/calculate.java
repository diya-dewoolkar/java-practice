package polymorphism;

public class calculate {
	void calculate(int a) {

        int square = a * a;

        System.out.println("Square: " + square);
    }

    void calculate(double a) {

        double cube = a * a * a;

        System.out.println("Cube: " + cube);
    }

    public static void main(String[] args) {

        calculate c = new calculate();

        c.calculate(5);

        c.calculate(5.0);
    }
}


