package org.example.basics;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the 1st Operand");
        double num1 = s.nextDouble();
        System.out.print("Enter the 2nd Operand");
        double num2 = s.nextDouble();
        System.out.println("1. add 2. mul 3. div 4. mod");
        System.out.print("Enter the operator");
        int operator = s.nextInt();
        double result;
        switch (operator) {
            case 1:
                result = num1 + num2;
                System.out.println("The sum of " + num1 + " and " + num2 + " is " + result);
                break;
            case 2:
                result = num1 * num2;
                System.out.println("The product of " + num1 + " and " + num2 + " is " + result);
                break;
            case 3:
                if (num2 != 0) {
                    result = num1 / num2;
                    System.out.println("The division of " + num1 + " by " + num2 + " is " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            case 4:
                if (num2 != 0) {
                    result = num1 % num2;
                    System.out.println("The remainder of " + num1 + " divided by " + num2 + " is " + result);
                } else {
                    System.out.println("Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator. Please choose a valid operation.");
                break;
        }
    }
}
