package org.example.basics;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter a number to generate its multiplication table");
        int n=s.nextInt();
        System.out.println("multiplication table for"+n+"is");
        for(int i=1;i<=10;i++)
            System.out.println(n*i);
    }
}
