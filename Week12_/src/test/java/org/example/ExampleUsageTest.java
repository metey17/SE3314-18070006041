package org.example;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for ExampleUsage.
 */

public class ExampleUsageTest {

    /**
     * Default constructor for ExampleUsageTest.
     */

    public ExampleUsageTest() {

    }


    /**
     * Test method for filterAndCountEvenNumbers.
     * It checks if the method correctly filters and counts even numbers in the range from 1 to 20.
     */

    @Test
    public void testFilterAndCountEvenNumbers() {
        ExampleUsage exampleUsage = new ExampleUsage();
        int result = exampleUsage.filterAndCountEvenNumbers();
        assertEquals(10, result);
    }

    /**
     * Test method for matrixDiagonalSum.
     * It checks if the method correctly calculates the sum of diagonal elements of a square matrix.
     */

    @Test
    public void testMatrixDiagonalSum() {
        ExampleUsage exampleUsage = new ExampleUsage();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int result = exampleUsage.matrixDiagonalSum(matrix);
        assertEquals(25, result);
    }
}
