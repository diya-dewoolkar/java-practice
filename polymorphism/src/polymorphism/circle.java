package polymorphism;

public class circle {

    void area(double r) {

        double circle = 3.14 * r * r;

        System.out.println("Area of circle :" + circle);
    }

    void area(int length, int breadth) {

        int rectangle = length * breadth;

        System.out.println("Area of rectangle :" + rectangle);
    }

    public static void main(String[] args) {

        circle a = new circle();

        a.area(5.0);

        a.area(10, 20);
    }
}