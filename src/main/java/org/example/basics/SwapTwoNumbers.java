package org.example.basics;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the first number");
        int num1=s.nextInt();
        System.out.println("enter the second number");
        int num2=s.nextInt();
        System.out.println("the numbers before swapping are num1 "+num1+"and num2 "+num2);
        int temp=num1;
        num1=num2;
        num2=temp;
        System.out.println("the numbers before swapping are num1 "+num1+"and num2 "+num2);
    }
}
