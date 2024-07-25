package org.example.basics;

import java.util.Scanner;

public class BillingDiscount {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the billing amount");
        int amt=s.nextInt();
        float disc= (float) (amt-(amt*0.1));
        if(amt>6000)
            System.out.println("net amount is"+disc);
        else
            System.out.println("net amount is"+amt);
    }
}
