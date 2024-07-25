package org.example.basics;

import java.util.Scanner;

public class NumberDenomination {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a 4 digit number");
        int num=s.nextInt();
        int thousand=num/1000;
        int hundred=(num/100)%10;
        int ten=(num/10)%10;
        int unit=num%10;
        System.out.println(thousand + "*1000 = " + (thousand * 1000));
        System.out.println(hundred + "*100 = " + (hundred * 100));
        System.out.println(ten + "*10 = " + (ten * 10));
        System.out.println(unit + "*1 = " + unit);
    }
}
