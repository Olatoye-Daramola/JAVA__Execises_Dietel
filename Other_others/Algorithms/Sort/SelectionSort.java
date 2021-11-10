package Algorithms.Sort;

import java.util.Arrays;

public class SelectionSort {
    public static void selectionSort(int[] array) {
        int largestIndex;
        for (int lastUnsortedIndex = array.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            largestIndex = 0;
            for (int indexForSwapping = 1; indexForSwapping < lastUnsortedIndex; indexForSwapping++) {
                if (array[indexForSwapping] >= array[largestIndex]) {
                    largestIndex = indexForSwapping;
                }
            }
            swap(array, largestIndex, lastUnsortedIndex);
        }
    }

    public static void swap(int[] array, int firstIndex, int secondIndex) {
        if (array[firstIndex] == array[secondIndex]) return;
        array[firstIndex] = array[firstIndex] ^ array[secondIndex];
        array[secondIndex] = array[firstIndex] ^ array[secondIndex];
        array[firstIndex] = array[firstIndex] ^ array[secondIndex];
    }

    public static void main(String[] args) {
        int[] array = {20, 35, -15, 7, 55, 1, -22};
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
