package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import tasks.task4.lab4;

import static org.junit.jupiter.api.Assertions.*;

class lab4Test {

    @Test
    public void testFindSimpleNumbersInArrayWithSimpleNumbers() {
        int[] arrayOfNumbers = {2, 3, 5, 7, 11, 13};
        ArrayList<Integer> expectedNumbers = new ArrayList<>(Arrays.asList(0, 1, 2, 3, 4, 5));

        ArrayList<Integer> result = lab4.findSimpleNumbersInArray(arrayOfNumbers);
        Assert.assertEquals(expectedNumbers, result);
    }

    @Test
    public void testFindSimpleNumbersInArrayWithNonSimpleNumbers() {
        int[] arrayOfNumbers = {4, 6, 8, 9, 10, 12};
        ArrayList<Integer> expectedNumbers = new ArrayList<>();

        ArrayList<Integer> result = lab4.findSimpleNumbersInArray(arrayOfNumbers);
        Assert.assertEquals(expectedNumbers, result);
    }

    @Test
    public void testFindSimpleNumbersInArrayWithEmptyArray() {
        int[] arrayOfNumbers = {};
        ArrayList<Integer> expectedNumbers = new ArrayList<>();

        ArrayList<Integer> result = lab4.findSimpleNumbersInArray(arrayOfNumbers);
        Assert.assertEquals(expectedNumbers, result);
    }

    @Test
    public void testIsSimpleNumberWithSimpleNumber() {
        boolean result = lab4.isSimpleNumber(17);
        Assert.assertTrue(result);
    }

    @Test
    public void testIsSimpleNumberWithNonSimpleNumber() {
        boolean result = lab4.isSimpleNumber(20);
        Assert.assertFalse(result);
    }

    @Test
    public void testIsSimpleNumberWithNegativeNumber() {
        boolean result = lab4.isSimpleNumber(-5);
        Assert.assertFalse(result);
    }
}