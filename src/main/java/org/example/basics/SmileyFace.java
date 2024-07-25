package org.example.basics;

public class SmileyFace {
    public static void main(String[] args) {
        int rows = 20;
        int cols = 80;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(":) ");
            }
            System.out.println();
        }
    }
}