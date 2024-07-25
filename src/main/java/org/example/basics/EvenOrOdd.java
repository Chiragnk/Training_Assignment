package org.example.basics;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number");
        int num=s.nextInt();
        if(num%2==0)
            System.out.println("entered number"+num+"is even");
        else
            System.out.println("entered number"+num+"is odd");
    }
}
