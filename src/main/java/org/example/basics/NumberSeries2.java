package org.example.basics;

import java.util.Scanner;

public class NumberSeries2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter any number");
        int n=s.nextInt();
        int sum=0;
        for(int i=1;i<=n;i+=2) {
            sum += i;
            System.out.println(i);
        }
        System.out.println("sum of series is"+sum);
    }
}
