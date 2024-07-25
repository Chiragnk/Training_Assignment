package org.example.basics;

import java.util.Scanner;

public class PowerOf2Numbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter first number");
        int num1=s.nextInt();
        System.out.println("enter second number");
        int num2=s.nextInt();
        int result = 1;
        for (int i = 0; i < num2; i++)
            result *= num1;
        System.out.println(num1 + "^" + num2 + " = " + result);
    }
}
