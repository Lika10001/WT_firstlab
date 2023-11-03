package tasks.task3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class lab3 {
    public void printOutTable(HashMap<Float, Float> map){
        System.out.printf("%-20s%-20s%", "Значение аргумента", "Значение функции");
        for(Map.Entry<Float, Float> entry : map.entrySet()){
            System.out.printf("%-20f%-20f%", entry.getKey(), entry.getValue());
        }
    }

    public HashMap<Float, Float> calculateTang(float a, float b, float h) {
        HashMap<Float, Float> dictionaryForCalculations = new HashMap<>();
        BigDecimal step = BigDecimal.valueOf(a);
        BigDecimal end = BigDecimal.valueOf(b);
        BigDecimal increment = BigDecimal.valueOf(h);

        while (step.compareTo(end) <= 0) {
            try {
                float calculatedStep = (float) Math.tan(step.floatValue());
                dictionaryForCalculations.put((float)Math.floor(step.floatValue()*10)/10f, calculatedStep);
            } catch (ArithmeticException e) {
                throw new RuntimeException("Error calculating tangent: " + e.getMessage(), e);
            }
            step = step.add(increment);
        }

        return dictionaryForCalculations;
    }
}
