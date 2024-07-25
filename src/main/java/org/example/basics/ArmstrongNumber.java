package org.example.basics;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int num=s.nextInt();
        int digit=0,count=0;
        int temp=num;
        while(num!=0)
        {
            num=num/10;
            count++;
        }
        num=temp;
        while(num!=0)
        {
            int rem=num%10;
            digit=digit+(int)Math.pow(rem,count);
            num=num/10;
        }
        if(digit==temp)
            System.out.println(temp+"is an amstrong number");
        else
            System.out.println(temp+"is not an amstrong number");
    }
}
