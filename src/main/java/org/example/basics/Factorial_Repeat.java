package org.example.basics;

import java.util.Scanner;

public class Factorial_Repeat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number ");
        int n=s.nextInt();
        int temp=n;
        int fact=1;
        while(n>0)
        {
            fact=fact*n;
            n--;
        }
        System.out.println("factorial of"+temp+"is"+fact);
    }
}
