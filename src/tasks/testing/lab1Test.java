package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.task1.lab1.calculateSolution;

class lab1Test {
    private static final double DELTA = 1e-15;

    @Test
    public void testCalculateSolutionWithPositiveValues() {
        double x = 2.5;
        double y = 1.8;
        double expected = 2.9312982124444154;
        double result = calculateSolution(x, y);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testCalculateSolutionWithNegativeValues() {
        double x = -3.2;
        double y = -0.5;
        double expected = -2.8235645841382446;
        double result = calculateSolution(x, y);
        Assert.assertEquals(expected, result, DELTA);
    }

    @Test
    public void testCalculateSolutionWithZeroValues() {
        double x = 0;
        double y = 0;
        double expected = 0.5;
        double result = calculateSolution(x, y);
        Assert.assertEquals(expected, result, DELTA);
    }

}