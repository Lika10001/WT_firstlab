package tasks.task7;

public class lab7 {
    public double[] sortArray(double[] arrayOfNumbers){
        double currentNumber;
        boolean sorted;
        do {
            sorted = true;

            for (int i = 0; i < arrayOfNumbers.length - 1; i++) {
                if (arrayOfNumbers[i] > arrayOfNumbers[i + 1]) {
                    currentNumber = arrayOfNumbers[i + 1];
                    arrayOfNumbers[i + 1] = arrayOfNumbers[i];
                    arrayOfNumbers[i] = currentNumber;
                    sorted = false;
                }
            }
        } while (!sorted);

        return arrayOfNumbers;
    }
}
