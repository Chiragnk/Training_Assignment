package org.example.basics;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the principal amount");
        int p=s.nextInt();
        System.out.println("enter the rate of interest ");
        int r=s.nextInt();
        System.out.println("enter the time period");
        int t=s.nextInt();
        int si=0;
        si=(p*t*r)/100;
        System.out.println("the simple interest is:"+si);

    }
}
