
package while_loop;

public class factorial_of5
{
    public static void main(String Args[])
    {
        int i = 1;
        int fact = 1;

        while (i <= 5)
        {
            fact = fact * i;
            i++;
        }

        System.out.println("Factorial = " + fact);
    }
}

