package org.example.basics;

import java.util.Scanner;

public class SingleDigitSum {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter any number");
        int num=s.nextInt();
        int rem=0,sum=0,newsum=0;
        while(num!=0)
        {
            rem=num%10;
            sum=sum+rem;
            num=num/10;
        }
        if(sum>=10)
        {
            while(sum!=0)
            {
                rem = sum % 10;
                newsum = newsum + rem;
                sum = sum / 10;
            }
            System.out.println("sum is"+newsum);
            return;
        }
        System.out.println("Sum is"+sum);
    }
}
