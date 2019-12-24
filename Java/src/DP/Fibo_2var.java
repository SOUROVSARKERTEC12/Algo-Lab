package DP;

public class Fibo_2var {

    static void fib(int n)
    {
        int a = 0, b = 1;
        if (n >= 0)
            System.out.print(a + " ");
        if (n >= 1)
            System.out.print(b + " ");
        for (int i = 2; i <= n; i++)
        {
            System.out.print(a + b + " ");
            b = a + b;
            a = b - a;
        }
    }

    // Driver code
    public static void main (String[] args)
    {
        fib(9);
    }
}
