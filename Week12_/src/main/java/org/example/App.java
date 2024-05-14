package org.example;

/**
 * Hello world!
 *
 */
public class App {

    /**
     * Default constructor for App.
     */
    private App() {
        // Default constructor
    }


    /**
     * The main method to run the application.
     *
     * @param args Command line arguments
     */

    public static void main(final String[] args) {
        LoopControl loopControl = new LoopControl();
        ExampleUsage exampleUsage = new ExampleUsage();

        // Displaying the correct and incorrect variable usage
        System.out.println("Demonstrating correct variable usage:");
        loopControl.correctVariableUsage();
        System.out.println("\nDemonstrating incorrect variable usage:");
        loopControl.incorrectVariableUsage();

        // Demonstrating empty block usage
        System.out.println("\nDemonstrating empty block usage (should handle without output):");
        loopControl.avoidEmptyBlock();

        // Demonstrating modified control variable
        System.out.println("\nDemonstrating correctly modified control variable:");
        loopControl.correctlyModifiedControlVariable();
        System.out.println("\nDemonstrating incorrectly modified control variable:");
        loopControl.modifiedControlVariable();

        // Using ExampleUsage class to show practical uses of loops
        System.out.println("\nDisplaying even numbers:");
        exampleUsage.displayEvenNumbers();

        // Summing an array
        System.out.println("\nSumming an array:");
        int sum = exampleUsage.sumArray();
        System.out.println("Total Sum: " + sum);

        // Processing a matrix
        System.out.println("\nProcessing a matrix:");
        exampleUsage.processMatrix();

        // Printing triangle
        System.out.println("\nPrinting a triangle:");
        loopControl.printTriangle();

        // Calculating sum of squares
        System.out.println("\nSum of squares of the first 10 positive integers: " + loopControl.sumOfSquares());

        // Calculating sum of diagonal elements of a matrix
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("\nSum of diagonal elements of the matrix: " + exampleUsage.matrixDiagonalSum(matrix));

        // Counting even numbers in the range 1 to 20
        System.out.println("\nCount of even numbers in the range 1 to 20: " + exampleUsage.filterAndCountEvenNumbers());
    }
}
