package org.example.basics;

import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int num=s.nextInt();
        int temp=num;
        int rem=0,sum=0;
        while(num>0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        System.out.println("sum of digits of entered number is"+sum);
    }
}
