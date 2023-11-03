package tasks.task8;

public class lab8 {
    public static void main(String[] args) {
        printIndexes(new double[]{1, 2, 3, 4, 5, 6}, new double[]{0, 4, 6, 8, 9, 10});
    }
    public static void printIndexes(double firstMassive[], double secondMassive[]) {
        for (int i = 0; i < secondMassive.length; i++)
            System.out.println(binarySearching(firstMassive, 0, firstMassive.length - 1, secondMassive[i]));
    }

    public static double binarySearching(double[] arr, int leftBorder, int rightBorder, double sElem) {
        if(arr.length == 0) return -1;
        while (leftBorder <= rightBorder) {
            int pilotElem = leftBorder + (rightBorder - leftBorder) / 2;
            if (arr[pilotElem] == sElem) {
                return pilotElem;
            }
            if (arr[pilotElem] < sElem) {
                leftBorder = pilotElem + 1;
            } else {
                rightBorder = pilotElem- 1;
            }
        }
        return -1;
    }
}
