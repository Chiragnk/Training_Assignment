package org.example.basics;

public class PatternMatrix {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(((5 - i + j) % 5 + 1) + " ");
            }
            System.out.println();
        }
    }
}
