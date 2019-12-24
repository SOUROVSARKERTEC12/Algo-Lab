package DP;

import java.util.Scanner;

public class FibonacciTabular {

    int fibonacci(int n) {
        int[] cache = new int[n+1];
        cache[0] = 0;
        cache[1] = 1;

        for (int i = 2; i <= n; i++) {
            cache[i] = cache[i-1] + cache[i-2];
        }

        return cache[n];
    }

    public static void main(String[] args) {

        Scanner  s = new Scanner(System.in);
         int n = s.nextInt();
        System.out.println(new FibonacciTabular().fibonacci(n));
    }
}
