package tasks.testing;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import tasks.task3.lab3;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class lab3Test {

    @Test
    public void testCalculateTangWithPositiveValues() {
        lab3 instance = new lab3();
        float a = 0.0f;
        float b = 1.0f;
        float h = 0.1f;

        HashMap<Float, Float> expectedResult = new HashMap<>();
        expectedResult.put(0.0f, 0.0f);
        expectedResult.put(0.1f, 0.100334674f);
        expectedResult.put(0.2f, 0.20271003f);
        expectedResult.put(0.3f, 0.30933627f);
        expectedResult.put(0.4f, 0.42279324f);
        expectedResult.put(0.5f, 0.5463025f);
        expectedResult.put(0.6f, 0.68413687f);
        expectedResult.put(0.7f, 0.8422884f);
        expectedResult.put(0.8f, 1.0296385f);
        expectedResult.put(0.9f, 1.2601583f);


        HashMap<Float, Float> result = instance.calculateTang(a, b, h);
        Assert.assertEquals(expectedResult, result);
    }

    @Test
    public void testCalculateTangWithNegativeValues() {
        lab3 instance = new lab3();
        float a = -1.0f;
        float b = 0.0f;
        float h = 0.2f;

        HashMap<Float, Float> expectedResult = new HashMap<>();
        expectedResult.put(-1.0f, -1.5574077f);
        expectedResult.put(-0.8f, -1.0296385f);
        expectedResult.put(-0.6f, -0.68413675f);
        expectedResult.put(-0.4f, -0.42279318f);
        expectedResult.put(-0.2f, -0.20271002f);

        HashMap<Float, Float> result = instance.calculateTang(a, b, h);
        Assert.assertEquals(expectedResult, result);
    }
}