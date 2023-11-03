package tasks.task6;

public class lab6 {
    public double[][] makeMatrix(double[] arrayOfNumbers){
        int sizeOfMatrix = arrayOfNumbers.length;
        double[][] matrix = new double[sizeOfMatrix][sizeOfMatrix];
        for(int i = 0; i < sizeOfMatrix; i++){
            for(int j = 0; j < sizeOfMatrix; j++){
                matrix[i][j] = arrayOfNumbers[j];
            }
            arrayOfNumbers = moveNumbersInArray(arrayOfNumbers);
        }
        return matrix;
    }

    public double[] moveNumbersInArray(double[] arrayOfNumbers){
        double firstNumber = arrayOfNumbers[0];
        for(int i = 0; i < arrayOfNumbers.length - 1; i++){
            arrayOfNumbers[i] = arrayOfNumbers[i + 1];
        }
        arrayOfNumbers[arrayOfNumbers.length - 1] = firstNumber;
        return arrayOfNumbers;
    }
}
