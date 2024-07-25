package org.example.basics;

import java.util.Scanner;

public class DifferenceOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number");
        int n1=s.nextInt();
        System.out.println("enter the second number");
        int n2=s.nextInt();
        if(n1>n2)
            System.out.println("difference is"+(n1-n2));
        else
            System.out.println("difference is"+(n2-n1));
    }
}
