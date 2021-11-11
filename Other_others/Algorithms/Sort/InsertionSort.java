package Algorithms.Sort;

import java.util.Arrays;

public class InsertionSort {
    public static void insertionSort(int[] array) {
        for (int firstUnsortedIndex = 1; firstUnsortedIndex < array.length; firstUnsortedIndex++) {
            int newElement = array[firstUnsortedIndex];
            int getat;
            for (getat = firstUnsortedIndex; getat > 0 && array[getat - 1] > newElement; getat--) {
                array[getat] = array[getat - 1];
            }
            array[getat] = newElement;
        }
    }

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
