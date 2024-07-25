package org.example.basics;

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter employee id");
        int empid=s.nextInt();
        System.out.println("Enter employee name");
        String name=s.next();
        System.out.println("Enter monthly salary");
        int sal=s.nextInt();
        System.out.println("hi "+name+",your employee id is "+empid+" and monthly salary is Rs "+sal+" annual salary is Rs "+sal*12);
    }
}
