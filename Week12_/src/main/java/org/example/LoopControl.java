package org.example;
/**
 * LoopControl class to demonstrate proper and improper use of loops.
 */
public class LoopControl {
    /**
     * Default constructor for LoopControl.
     */
    public LoopControl() {

    }

    /**
     * Incorrect usage of variable declaration according to VariableDeclarationUsageDistance rule.
     */
    public void incorrectVariableUsage() {
        int index=0;
        // Some other code
        System.out.println("Preparing to loop...");
        // Loop starts much later after declaration
        for (; index < 5; index++) {
            System.out.println(index);
        }
    }
    /**
     * Demonstrates an empty block, which should be avoided.
     */

    public void avoidEmptyBlock() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                System.out.println("Midpoint at: " + j);
            }
        }
    }

    /**
     * Demonstrates incorrect modification of the control variable.
     */
    public void modifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                m += 3; // Incorrect - modifying control variable inside the loop
                System.out.println("to " + m);
            }
        }
    }
    /**
     * Demonstrates correct usage of variable declaration.
     */

    public void correctVariableUsage() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Correctly using loop variable: " + i);
        }
    }

    /**
     * Demonstrates correctly modifying the control variable.
     */

    public void correctlyModifiedControlVariable() {
        for (int m = 0; m < 10; m++) {
            if (m == 5) {
                System.out.println("Adjusting loop index from " + m);
                System.out.println("to " + (m + 2)); // Print the adjusted value instead
            }
        }
    }
    /**
     * Calculates the sum of squares of the first 10 positive integers.
     *
     * @return sum of squares of the first 10 positive integers
     */

    public int sumOfSquares() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i * i;
        }
        return sum;
    }

    /**
     * Prints a right-angled triangle made of  (*) with a height of 5 lines.
     * This method does not include any EmptyBlock violations.
     */

    public void printTriangle() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

