package tasks.task9;

import java.util.ArrayList;
import java.util.Random;

import static tasks.task9.BallColor.BLUE;

public class BasketFiller {
    final static int MAX_BALLS_NUMBER = 100;
    final static int MAX_BALLS_WEIGHT = 200;
    final static BallColor SPECIAL_BALL_COLOUR = BLUE;
    final static BallColor[] ballColours = BallColor.values();

    public static void main(String[] args){
        Random basketSizeGenerator = new Random();
        final int basketSize = basketSizeGenerator.nextInt(MAX_BALLS_NUMBER);
        ArrayList<Ball> arrayWithSetColorBalls;
        Random colourGenerator = new Random();
        Random weightGenerator = new Random();
        ArrayList<Ball> balls = new ArrayList<>();
        int currBallColour;
        int weight;
        for(int i = 0; i < basketSize; i++){
            currBallColour = colourGenerator.nextInt(ballColours.length);
            weight = weightGenerator.nextInt(MAX_BALLS_WEIGHT);
            Ball oneBall = new Ball(weight, ballColours[currBallColour].toString());
            balls.add(oneBall);
        }
        Basket currentBasket = new Basket(basketSize, balls);
        currentBasket.setWeight();
        arrayWithSetColorBalls = currentBasket.getBallsWithSpecialColour(SPECIAL_BALL_COLOUR);
        printResultInConsole(currentBasket.getWeight(), arrayWithSetColorBalls);
    }

    public static void printResultInConsole(int weight, ArrayList<Ball> balls){
        String formatStr = String.format("Amount %s balls in basket - %d, average weigth of basket - %d", SPECIAL_BALL_COLOUR.toString(), balls.size(), weight);
        System.out.println(formatStr);
    }

}















































































