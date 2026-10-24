
package types_of_methods;

public class thirty_problems {

    
    public int calculate(int a, int b) {
        return a + b;
    }

    
    public int calculate(int a, int b, int c) {
        return a - b - c;
    }

    
    public int calculate(int a) {
        return a * a;
    }

    
    public double calculate(double a, double b) {
        return a / b;
    }

    
    public int calculate(int a, int b, int c, int d) {
        return a % b;
    }

    
    public int calculate(int a, int b, int c, int d, int e) {
        return a * a * a;
    }

    
    public double calculate(double a, double b, double c) {
        return a + b + c;
    }

    
    public float calculate(float a, float b) {
        return a + b;
    }

    
    public long calculate(long a, long b) {
        return a + b;
    }

    
    public int calculate(int a, int b, boolean greater) {
        return (a > b) ? a : b;
    }

    
    public int calculate(int a, int b, char smaller) {
        return (a < b) ? a : b;
    }

    
    public int calculate(int a, boolean even) {
        return a % 2;
    }

    
    public int calculate(int a, char sign) {
        if (a > 0)
            return 1;
        if (a < 0)
            return -1;
        return 0;
    }

    
    public int calculate(int a, short abs) {
        return Math.abs(a);
    }

    
    public int calculate(int n, byte sum) {
        return n * (n + 1) / 2;
    }

   
    public long calculate(int n, long factorial) {
        long result = 1;

        for (int i = 1; i <= n; i++) {
            result = result * i;
        }

        return result;
    }

  
    public int calculate(int n, float reverse) {
        int result = 0;

        while (n != 0) {
            result = result * 10 + n % 10;
            n = n / 10;
        }

        return result;
    }

   
    public int calculate(int n, double digitSum) {
        int sum = 0;

        while (n != 0) {
            sum = sum + n % 10;
            n = n / 10;
        }

        return sum;
    }

    
    public int calculate(int n, String count) {
        return String.valueOf(Math.abs((long) n)).length();
    }

    
    public boolean calculate(int n, String palindrome, boolean check) {
        int original = n;
        int reverse = 0;

        while (n != 0) {
            reverse = reverse * 10 + n % 10;
            n = n / 10;
        }

        return original == reverse;
    }

    public boolean calculate(int n, String prime, int unused) {
        if (n < 2)
            return false;

        for (int i = 2; i <= n / i; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    
    public int calculate(int a, int b, int c, boolean max) {
        return Math.max(a, Math.max(b, c));
    }

    
    public int calculate(int a, int b, int c, char min) {
        return Math.min(a, Math.min(b, c));
    }

    
    public double calculate(double a, int square) {
        return a * a;
    }

  
    public double calculate(double p, double r, double t, int interest) {
        return (p * r * t) / 100;
    }

    
    public int calculate(char ch) {
        return ch;
    }

 
    public double calculate(int n, double conversion, boolean convert) {
        return n;
    }

   
   
    public int calculate(int length, int breadth, String rectangle) {
        return length * breadth;
    }

    
    public double calculate(double radius, String circle) {
        return Math.PI * radius * radius;
    }
}
