package org.example.basics;

public class PatternI {
    public static void main(String[] args) {
        int height = 7;
        int width = 9;

        for (int i = 0; i < height; i++) {
            if (i == 0 || i == height - 1) {
                for (int j = 0; j < width; j++) {
                    System.out.print("*");
                }
            } else {
                for (int j = 0; j < width / 2; j++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
