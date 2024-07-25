package org.example.basics;

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of natural numbers to be generated");
        int n=s.nextInt();
        System.out.println("the"+n+"natural numbers generated are");
        for(int i=1;i<=n;i++)
        {
            System.out.println(i);
        }
    }
}
