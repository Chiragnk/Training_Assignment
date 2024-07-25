package org.example.basics;

import java.util.Scanner;

public class DigitIncrement {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a 5 digit number");
        int num=s.nextInt();
        int result = 0;
        int place = 1;
        while (num > 0) {
            int digit = num % 10;
            digit = (digit + 1) % 10;
            result = digit * place + result;
            place *= 10;
            num /= 10;
        }
        System.out.println("Output: " + result);
    }
}
