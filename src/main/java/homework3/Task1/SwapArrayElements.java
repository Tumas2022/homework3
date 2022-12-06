package homework3.Task1;

import java.util.Arrays;

public class SwapArrayElements {
    public static void main(String[] args) {

        Integer[] iArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        String[] sArray = {" one ", " two ", " three ", " four ", " five ", " six ", " seven "};
        try {
            swapTwoElementsInArray(iArray, 0, 2);
            swapTwoElementsInArray(sArray, 0, 2);
        } catch (WrongPositionException e) {
            e.printStackTrace();
        }
        System.out.println("Поменять местами результат в целочисленном массиве: " + Arrays.toString(iArray));
        System.out.println("Поменять местами результат в целочисленном массиве: " + Arrays.toString(sArray));
    }
    private void swapTwoNumbersInArray(int[] array, int firstNumberPos, int secondNumberPos) throws WrongPositionException {
        if (firstNumberPos < 0 || firstNumberPos > array.length ||
                secondNumberPos < 0 || secondNumberPos > array.length || firstNumberPos == secondNumberPos) {
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }
    }
    private static void swapTwoElementsInArray(Object[] array, int firstNumPos, int secondNumPos) throws WrongPositionException {
        if (firstNumPos < 0 || firstNumPos > array.length ||
                secondNumPos < 0 || secondNumPos > array.length || firstNumPos == secondNumPos) {
            throw new WrongPositionException("Неправильно указаны позиции элементов для замены");
        }
        Object temp = array[firstNumPos];
        array[firstNumPos] = array[secondNumPos];
        array[secondNumPos] = temp;
    }
    public static class WrongPositionException extends Exception {
        public WrongPositionException(String message) {
            super(message);
        }
    }
}


