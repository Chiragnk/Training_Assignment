package org.example.basics;

public class Pattern8 {
    public static void main(String[] args) {
        int rows = 3;
        char currentChar = 'A';
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(currentChar + " ");
                currentChar++;
            }

            System.out.println();
        }
    }
}
