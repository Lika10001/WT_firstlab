package tasks.task9;

public enum BallColor {
    BLACK, WHITE, BLUE, RED, YELLOW;

    public static BallColor getEnumByString(String colour){
        BallColor currColor;
        switch (colour.toUpperCase()) {
            case "BLACK": currColor = BLACK;break;
            case "WHITE": currColor = WHITE;break;
            case "RED": currColor = RED;break;
            case "BLUE": currColor = BLUE;break;
            case "YELLOW": currColor = YELLOW;break;
            default: currColor = null;
        }
        return currColor;
    }
}
