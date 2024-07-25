package org.example.basics;

public class Matrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {3, 5, 7},
                {2, 8, 1},
                {4, 6, 9}
        };
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int totalSum = 0;

        for (int[] row : matrix) {
            for (int element : row) {
                if (element > largest) {
                    largest = element;
                }
                if (element < smallest) {
                    smallest = element;
                }
                totalSum += element;
            }
        }

        System.out.println("Largest element: " + largest);
        System.out.println("Smallest element: " + smallest);
        System.out.println("Sum of all elements: " + totalSum);
    }
}
