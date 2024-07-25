package org.example.basics;

import java.util.Scanner;

public class MembershipRegistration {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the name");
        String name=s.next();
        System.out.println("enter the phone number");
        int ph=s.nextInt();
        System.out.println("enter the age");
        int age=s.nextInt();
        if(age>18)
            System.out.println("congratulations "+name+" for your successful registration");
        else
            System.out.println("sorry u need to be atleast 18 years old for the membership");
    }
}
