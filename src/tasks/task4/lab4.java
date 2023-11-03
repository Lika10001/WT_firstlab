package tasks.task4;

import java.util.ArrayList;

public class lab4 {

    public static ArrayList<Integer> findSimpleNumbersInArray(int[] arrayOfNumbers){
        final ArrayList<Integer> simpleNumbers = new ArrayList<>();
        for(int i = 0; i < arrayOfNumbers.length; i++){
            if(isSimpleNumber(arrayOfNumbers[i]))
                simpleNumbers.add(i);
        }
        return simpleNumbers;
    }

    public static boolean isSimpleNumber(int number){
        if (number < 2) return false;
        for(int i = 2; i <= number/2; i++){
            if(number % i == 0) {
                return false;
            }
        }
        return true;
    }

}
