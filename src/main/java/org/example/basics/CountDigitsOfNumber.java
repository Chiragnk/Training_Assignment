package org.example.basics;

import java.util.Scanner;

public class CountDigitsOfNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int num=s.nextInt();
        int rem=0,count=0;
        while(num>0)
        {
            num=num/10;
            count++;
        }
        System.out.println("the number of digits in the entered number is"+count);
    }
}
