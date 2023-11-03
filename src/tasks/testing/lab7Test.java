package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tasks.task7.lab7;

import static org.junit.jupiter.api.Assertions.*;

class lab7Test {

    @Test
    public void testSortArrayWithEmptyArray() {
        double[] array = {};
        double[] expectedArray = {};

        lab7 task = new lab7();
        double[] resultArray = task.sortArray(array);

        Assert.assertArrayEquals(expectedArray, resultArray, 0.0001);
    }

    @Test
    public void testSortArrayWithSingleElementArray() {
        double[] array = {5.0};
        double[] expectedArray = {5.0};

        lab7 task = new lab7();
        double[] resultArray = task.sortArray(array);

        Assert.assertArrayEquals(expectedArray, resultArray, 0.0001);
    }

    @Test
    public void testSortArrayWithSortedArray() {
        double[] array = {1.0, 2.0, 3.0, 4.0};
        double[] expectedArray = {1.0, 2.0, 3.0, 4.0};

        lab7 task = new lab7();
        double[] resultArray = task.sortArray(array);

        Assert.assertArrayEquals(expectedArray, resultArray, 0.0001);
    }

    @Test
    public void testSortArrayWithUnsortedArray() {
        double[] array = {4.0, 2.0, 1.0, 3.0};
        double[] expectedArray = {1.0, 2.0, 3.0, 4.0};

        lab7 task = new lab7();
        double[] resultArray = task.sortArray(array);

        Assert.assertArrayEquals(expectedArray, resultArray, 0.0001);
    }

    @Test
    public void testSortArrayWithDuplicateElements() {
        double[] array = {3.0, 2.0, 4.0, 2.0, 1.0, 4.0};
        double[] expectedArray = {1.0, 2.0, 2.0, 3.0, 4.0, 4.0};

        lab7 task = new lab7();
        double[] resultArray = task.sortArray(array);

        Assert.assertArrayEquals(expectedArray, resultArray, 0.0001);
    }
}