package org.example.basics;

import java.util.Scanner;

public class GreaterOfTwoNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=s.nextInt();
        System.out.println("enter the second number");
        int num2=s.nextInt();
        if(num1>num2)
            System.out.println("greater of 2 numbers is"+num1);
        else
            System.out.println("greater of 2 numbers is"+num2);
    }
}
