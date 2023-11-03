package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import tasks.task8.lab8;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class lab8Test {

    @Test
    public void testBinarySearchingWithEmptyArray() {
        double[] array = {};
        int leftBorder = 0;
        int rightBorder = 0;
        double searchElement = 5.0;

        int expectedResult = -1;

        lab8 task = new lab8();
        double result = task.binarySearching(array, leftBorder, rightBorder, searchElement);

        Assert.assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    public void testBinarySearchingWithElementInArray() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        int leftBorder = 0;
        int rightBorder = array.length - 1;
        double searchElement = 4.0;

        int expectedResult = 3;

        lab8 task = new lab8();
        double result = task.binarySearching(array, leftBorder, rightBorder, searchElement);

        Assert.assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    public void testBinarySearchingWithElementNotInArray() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        int leftBorder = 0;
        int rightBorder = array.length - 1;
        double searchElement = 7.0;

        int expectedResult = -1;

        lab8 task = new lab8();
        double result = task.binarySearching(array, leftBorder, rightBorder, searchElement);

        Assert.assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    public void testBinarySearchingWithElementAtLeftBorder() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        int leftBorder = 0;
        int rightBorder = array.length - 1;
        double searchElement = 0.5;

        int expectedResult = -1;

        lab8 task = new lab8();
        double result = task.binarySearching(array, leftBorder, rightBorder, searchElement);

        Assert.assertEquals(expectedResult, result, 0.0001);
    }

    @Test
    public void testBinarySearchingWithElementAtRightBorder() {
        double[] array = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0};
        int leftBorder = 0;
        int rightBorder = array.length - 1;
        double searchElement = 7.5;

        int expectedResult = -1;

        lab8 task = new lab8();
        double result = task.binarySearching(array, leftBorder, rightBorder, searchElement);

        Assert.assertEquals(expectedResult, result, 0.0001);
    }
}