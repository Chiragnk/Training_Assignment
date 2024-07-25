package org.example.basics;

import java.util.Scanner;

public class BillingAmount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the bill amount");
        int amt=s.nextInt();
        System.out.println("do you have membership card?");
        char ans=s.next().charAt(0);
        if(ans=='Y')
            System.out.println("thank you your total bill amount is"+amt+"your discount is "+amt*0.1+"net payable amount is"+(amt-amt*0.1));
        else if(ans=='N')
            System.out.println("thank you your total bill amount is"+amt+"your discount is "+amt*0.03+"net payable amount is"+(amt-amt*0.03));
    }
}
