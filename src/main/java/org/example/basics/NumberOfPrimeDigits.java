package org.example.basics;

import java.util.Scanner;

public class NumberOfPrimeDigits {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int num=s.nextInt();
        int rem=0,count=0;
        while(num>0)
        {
            rem=num%10;
            if(rem%2!=0&&rem%3!=0||rem==3||rem==2)
             count++;
            num=num/10;
        }
        System.out.println(count);
    }
}
