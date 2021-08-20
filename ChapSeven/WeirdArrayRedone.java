package TryoutsAgain;

import java.util.Scanner;

public class WeirdArrayRedone {
    public static void main(String[] args) {
        int[] numbers = getNumbers();
        System.out.println("\nThe Sum of your array is: " + calculateTotalOf(numbers));
        System.out.println("The Largest Sum of your weird sums is: " + findLargestWeirdSumOf(numbers));
        System.out.println("The Smallest Sum of your weird sums is: " + findSmallestWeirdSumOf(numbers));
    }

    public static int[] getNumbers() {
        return getNumbersArray();
    }

    public static int[] getNumbersArray() {
        System.out.println("How many numbers do you want to enter: ");
        Scanner scan = new Scanner(System.in);
        int numberSize = scan.nextInt();
        int[] numbers = new int[numberSize];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("\nEnter number " + (i+1));
            numbers[i] = scan.nextInt();
        }
        return numbers;
    }

    public static int calculateTotalOf(int... numbers) {
        int total = 0;
        for(int number : numbers) {
            total += number;
        }
        return total;
    }

    public static int findLargestWeirdSumOf(int... numbers){
        int largestNumber = numbers[0];
        for(int sum : numbers){
            if(sum > largestNumber) {
                largestNumber = sum;
            }
        }
        int total = calculateTotalOf(numbers);
        return total - largestNumber;
    }

    public static int findSmallestWeirdSumOf(int... numbers) {
        int smallestNumber = numbers[0];
        for(int sum : numbers){
            if(sum < smallestNumber) {
                smallestNumber = sum;
            }
        }
        int total = calculateTotalOf(numbers);
        return total - smallestNumber;
    }
}
