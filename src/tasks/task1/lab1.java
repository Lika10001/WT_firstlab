package tasks.task1;

public class lab1 {
    public static double calculateSolution(double x, double y){
        double solution;
        solution = (1 + Math.pow(Math.sin(x + y), 2))/(2 + Math.abs(x - ((2 * x) / (1 + Math.pow(x, 2) * Math.pow(y, 2)) ))) + x;
        return solution;
    }
}
