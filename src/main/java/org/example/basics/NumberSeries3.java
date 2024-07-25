package org.example.basics;

import java.util.Scanner;

public class NumberSeries3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number");
        int n=s.nextInt();
        float sum=0;
        for(int i=1;i<=n;i++)
            sum+= (float) 1 /(i*i*i);
        System.out.println("sum is"+sum);
    }
}
