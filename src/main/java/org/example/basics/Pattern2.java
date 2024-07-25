package org.example.basics;

public class Pattern2 {
    public static void main(String[] args) {
        int rows = 3;
        int number = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                if (number <= rows * rows) {
                    System.out.print(number + " ");
                    number++;
                }
            }
            System.out.println();
        }
    }
}
