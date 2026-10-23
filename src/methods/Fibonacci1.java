package methods;

public class Fibonacci1 {

    void fibonacci() {

        int a = 0, b = 1, c;

        for (int i = 1; i <= 10; i++) {

            System.out.print(a + " ");

            c = a + b;
            a = b;
            b = c;
        }
    }
}