package tasks.testing;

import org.junit.jupiter.api.Test;
import tasks.task9.Ball;
import tasks.task9.Basket;

import java.util.ArrayList;
import tasks.task9.BallColor;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    void getBallsWithSpecialColour() {
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(79, BallColor.BLUE.toString()));
        balls.add(new Ball(21,  BallColor.WHITE.toString()));
        balls.add(new Ball(30,  BallColor.BLUE.toString()));
        balls.add(new Ball(200,  BallColor.YELLOW.toString()));
        balls.add(new Ball(78,  BallColor.BLACK.toString()));
        balls.add(new Ball(87,  BallColor.BLUE.toString()));
        Basket basket = new Basket(6, balls);
        ArrayList<Ball> sortedBalls = basket.getBallsWithSpecialColour(BallColor.BLUE);
        ArrayList<Ball> expectedBalls = new ArrayList<>();
        expectedBalls.add(new Ball(79, BallColor.BLUE.toString()));
        expectedBalls.add(new Ball(30,  BallColor.BLUE.toString()));
        expectedBalls.add(new Ball(87,  BallColor.BLUE.toString()));
        sortedBalls.equals(expectedBalls);
    }
}