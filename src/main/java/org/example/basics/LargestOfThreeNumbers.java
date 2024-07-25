package org.example.basics;

import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=s.nextInt();
        System.out.println("enter the second number");
        int num2=s.nextInt();
        System.out.println("enter the third number");
        int num3=s.nextInt();
        int largest=0;
        if(num1>num2 && num1>num3)
            System.out.println("the largest number is"+num1);
        else if(num2>num1 && num2>num3)
            System.out.println("the largest number is"+num2);
        else if(num3>num2 && num3>num1)
            System.out.println("the largest number is"+num3);
    }
}
