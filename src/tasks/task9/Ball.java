package tasks.task9;

public class Ball {
    private BallColor colour;
    private int weight;

    public Ball(int weight, String colour){
        this.colour = BallColor.getEnumByString(colour);
        this.weight = weight;
    }
    public void setColour(String colour){ this.colour = BallColor.getEnumByString(colour);}
    public void setWeight(int weight){this.weight = weight;}
    public BallColor getColour(){return this.colour;}
    public int getWeight(){ return this.weight;}
    public String getColor(){return this.colour.toString();}
}
