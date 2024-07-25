package org.example.basics;

public class Pattern7 {
    public static void main(String[] args) {
        int rows = 3;
        int startNumber = 19;
        int currentNumber = startNumber;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(currentNumber + " ");
                currentNumber += 19;
            }

            System.out.println();
        }
    }
}
