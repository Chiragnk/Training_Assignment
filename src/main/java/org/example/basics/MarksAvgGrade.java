package org.example.basics;

import java.util.Scanner;

public class MarksAvgGrade {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the marks scored in subject 1");
        int s1=s.nextInt();
        System.out.println("enter the marks scored in subject 2");
        int s2=s.nextInt();
        System.out.println("enter the marks scored in subject 3");
        int s3=s.nextInt();
        int sum=0;
        sum=s1+s2+s3;
        if(sum/3<35)
            System.out.println("total marks"+sum+"average"+sum/3+"grade:C");
        else if (sum/3>35&&sum/3<65)
            System.out.println("total marks"+sum+"average"+sum/3+"grade:B");
        else
            System.out.println("total marks"+sum+"average"+sum/3+"grade:A");
    }
}
