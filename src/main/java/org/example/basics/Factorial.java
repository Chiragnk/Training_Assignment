package org.example.basics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("enter any number");
        int num=s.nextInt();
        int fact=1;
        while(num>0)
        {
            fact=fact*num;
            num--;
        }
        System.out.println("factorial is"+fact);
    }
}
