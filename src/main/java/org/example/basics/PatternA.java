package org.example.basics;

public class PatternA {
    public static void main(String[] args) {
        int height = 7;
        for (int i = 0; i < height; i++) {
            for (int j = 0; j <= height; j++) {
                if (i == 0 && (j != 0 && j != height)) {
                    System.out.print('@');
                }
                else if (i == height / 2) {
                    System.out.print('@');
                }
                else if (j == 0 || j == height) {
                    System.out.print('@');
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
