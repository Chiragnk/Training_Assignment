package org.example.basics;

import java.util.Scanner;

public class PositiveNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        if(num>0)
            System.out.println("the result is"+num);
        else
            System.out.println("the result is"+Math.abs(num));
    }
}
