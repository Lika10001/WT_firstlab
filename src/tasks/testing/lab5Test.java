package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tasks.task5.lab5;

import static org.junit.jupiter.api.Assertions.*;

class lab5Test {

    @Test
    public void testFindLeastNumberOfElementsWithSortedArray() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int expectedResult = 0;

        int result = lab5.findLeastNumberOfElements(array);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testFindLeastNumberOfElementsWithEmptyArray() {
        int[] array = {};
        int expectedResult = 0;

        int result = lab5.findLeastNumberOfElements(array);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testFindLeastNumberOfElementsWithSingleElementArray() {
        int[] array = {42};
        int expectedResult = 0;

        int result = lab5.findLeastNumberOfElements(array);
        Assert.assertEquals(expectedResult, result);
    }


}
