package org.example.basics;

import java.util.Scanner;

public class ReciprocalOfFactorialPattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        double sum = 0.0;
        for (int i = 1; i <= 7; i++) {
            double factorial = 1.0;
            for (int j = 1; j <= i; j++) {
                factorial *= j;
            }
            sum += (double) i / factorial;
        }
        System.out.print("The sum of the first 7 terms of the series is:"+sum);
    }
}

