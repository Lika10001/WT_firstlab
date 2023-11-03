package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static tasks.task2.lab2.*;

class lab2Test {

    @Test
    public void testCheckBottomOfFigureWithinRange() {
        boolean result = checkBottomOfFigure(0, -1);
        Assert.assertTrue(result);
    }

    @Test
    public void testCheckBottomOfFigureOutsideRange() {
        boolean result = checkBottomOfFigure(7, -2);
        Assert.assertFalse(result);
    }

    @Test
    public void testCheckTopOfFigureWithinRange() {
        boolean result = checkTopOfFigure(-3, 3);
        Assert.assertTrue(result);
    }

    @Test
    public void testCheckTopOfFigureOutsideRange() {
        boolean result = checkTopOfFigure(5, 6);
        Assert.assertFalse(result);
    }

    @Test
    public void testCheckBothBottomAndTopOfFigure() {
        boolean result = check(2, 1);
        Assert.assertTrue(result);
    }

    @Test
    public void testCheckNeitherBottomNorTopOfFigure() {
        boolean result = check(-7, 5);
        Assert.assertFalse(result);
    }
}