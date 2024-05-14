package org.example;

/**
 * ExampleUsage class for practical data manipulation using loops.
 */

public class ExampleUsage {

    /**
     * Holds the sum of the array elements.
     */

     private int sum = 0; // Correct usage of variable scope

    /**
     * Default constructor for ExampleUsage.
     */

    public ExampleUsage() {
        // Default constructor
    }

    /**
     * Method to demonstrate using loops to filter data.
     * Displays even numbers from an array.
     */

    // Method to demonstrate using loops to filter data
    public void displayEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // Display even numbers only
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println("Even number: " + number);
            }
        }
    }

    /**
     * Method to sum an array of integers demonstrating the use of loops and variable scope.
     *
     * @return sum of the array elements
     */

    // Method to sum an array of integers demonstrating the use of loops and variable scope
    public int sumArray() {
        int[] numbers = {5, 10, 15, 20, 25};

        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of array: " + sum);
        return sum;
    }

    /**
     * Example of using nested loops to process multidimensional data.
     * Prints each element of a 3x3 matrix.
     */

    // Example of using nested loops to process multidimensional data
    public void processMatrix() {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Iterate over each row and column of the matrix
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.println("Element at [" + i + "][" + j + "] is " + matrix[i][j]);
            }
        }
    }
    /**
     * Filters and counts even numbers in an array of integers from 1 to 20.
     *
     * @return count of even numbers in the array
     */

    public int filterAndCountEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int evenCount = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            }
        }

        return evenCount;
}
    /**
     * Calculates the sum of the diagonal elements of a 3x3 matrix.
     *
     * @param matrix 3x3 matrix
     * @return sum of the diagonal elements
     */

    public int matrixDiagonalSum(final int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j || i + j == matrix.length - 1) {
                    sum += matrix[i][j];
                }
            }
        }

        return sum;
    }
}
