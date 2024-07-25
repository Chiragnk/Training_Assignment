package org.example.basics;

public class Pattern10 {
    public static void main(String[] args) {
        int rows = 3;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (i == j) {
                    System.out.print("19 ");
                } else {
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
