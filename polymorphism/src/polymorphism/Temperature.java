package polymorphism;

public class Temperature {

    void convert(double celsius) {

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.println("Fahrenheit: " + fahrenheit);
    }

    void convert(int fahrenheit) {

        double celsius = (fahrenheit - 32) * 5.0 / 9;

        System.out.println("Celsius: " + celsius);
    }

    public static void main(String[] args) {

        Temperature t = new Temperature();

        t.convert(37.0);

        t.convert(98);
    }
}