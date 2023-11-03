package tasks.task9;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Ball> balls;
    private int weight;
    private int size;

    public Basket(int size, ArrayList<Ball> balls){
        this.balls = balls;
        this.size = size;
    }

    public void setBalls(ArrayList<Ball> balls){this.balls = balls;}
    public void setWeight(){ this.weight = calculateWeight(this.balls);}
    public void setSize(int size){this.size = size;}
    public ArrayList<Ball> getBalls(){ return this.balls;}
    public int getWeight(){ return this.weight;}
    public int getSize(){return this.size;}

    public int calculateWeight(ArrayList<Ball> balls){
        int weight = 0;
        for(Ball currBall : balls){
            weight += currBall.getWeight();
        }
        return weight;
    }

    public ArrayList<Ball> getBallsWithSpecialColour(BallColor colour){
        ArrayList<Ball> ballsWithSpecialColour = new ArrayList<>();
        for(Ball ball : this.balls){
            if(colour.equals(ball.getColour())){
                ballsWithSpecialColour.add(ball);
            }
        }
        return ballsWithSpecialColour;
    }

}
