package org.example.basics;

import java.util.Scanner;

public class FibonacciUntilUpperBound {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the upper bound to generate the fibonacci numbers");
        int upper = s.nextInt();
        int fib0= 0, fib1= 1;
        System.out.println("Fibonacci Series up to " + upper + ":");
        if (upper >= fib0) {
            System.out.print(fib0 + " ");
        }
        while (fib1 <= upper) {
            System.out.print(fib1 + " ");
            int temp = fib0 + fib1;
            fib0 = fib1;
            fib1 = temp;
        }
    }
}
