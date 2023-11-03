package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tasks.task6.lab6;

import static org.junit.jupiter.api.Assertions.*;

class lab6Test {
    @Test
    public void testMakeMatrixWithEmptyArray() {
        double[] array = {};
        double[][] expectedMatrix = {};

        lab6 lab = new lab6();
        double[][] resultMatrix = lab.makeMatrix(array);

        Assert.assertArrayEquals(expectedMatrix, resultMatrix);
    }

    @Test
    public void testMakeMatrixWithSingleElementArray() {
        double[] array = {5.0};
        double[][] expectedMatrix = {{5.0}};

        lab6 lab = new lab6();
        double[][] resultMatrix = lab.makeMatrix(array);

        Assert.assertArrayEquals(expectedMatrix, resultMatrix);
    }

    @Test
    public void testMakeMatrixWithMultipleElementsArray() {
        double[] array = {2.0, 4.0, 6.0};
        double[][] expectedMatrix = {
                {2.0, 4.0, 6.0},
                {4.0, 6.0, 2.0},
                {6.0, 2.0, 4.0}
        };

        lab6 lab = new lab6();
        double[][] resultMatrix = lab.makeMatrix(array);

        Assert.assertArrayEquals(expectedMatrix, resultMatrix);
    }

    @Test
    public void testMoveNumbersInArray() {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        double[] expectedArray = {2.0, 3.0, 4.0, 1.0};

        lab6 lab = new lab6();
        double[] resultArray = lab.moveNumbersInArray(array);

        Assert.assertArrayEquals(expectedArray, resultArray, 0.0001);
    }

}