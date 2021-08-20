package TryoutsAgain;

import java.util.Arrays;
import java.util.Scanner;

public class WeirdArray {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        System.out.println("\nThe Sum of your array is: " + calculateTotalOf(numbers));
        System.out.println("The Weird Sums of your array are: " + Arrays.toString(getArrayOfWeirdSumsOf(numbers)));
        System.out.println("The Largest Sum of your weird sums is: " + findLargestWeirdSumOf(numbers));
        System.out.println("The Smallest Sum of your weird sums is: " + findSmallestWeirdSumOf(numbers));
    }

    public static int[] getNumbers() {
        return getNumbers();
    }

    public static int calculateTotalOf(int... numbers) {
        int total = 0;
        for(int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int[] getArrayOfWeirdSumsOf(int... numbers) {
        int total = calculateTotalOf(numbers);
        int[] weirdSums = new int[numbers.length];
        for (int i = 0; i < numbers.length;i++) {
            weirdSums[i] = total - numbers[i];
        }
        return weirdSums;
    }

    public static int findLargestWeirdSumOf(int... numbers){
        int[] weirdSums = getArrayOfWeirdSumsOf(numbers);
        int largestSum = weirdSums[0];
        for(int sum : weirdSums){
            if(sum > largestSum) {
                largestSum = sum;
            }
        }
        return largestSum;
    }

    public static int findSmallestWeirdSumOf(int... numbers) {
        int[] weirdSums = getArrayOfWeirdSumsOf(numbers);
        int smallestSum = weirdSums[0];
        for(int sum : weirdSums){
            if(sum < smallestSum) {
                smallestSum = sum;
            }
        }
        return smallestSum;
    }
}
