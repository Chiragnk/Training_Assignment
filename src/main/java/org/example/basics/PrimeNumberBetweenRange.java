package org.example.basics;

import java.util.Scanner;

public class PrimeNumberBetweenRange {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the lower bound value");
        int l=s.nextInt();
        System.out.println("enter the upper bound value");
        int u=s.nextInt();
        for (int i = l; i <= u; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
