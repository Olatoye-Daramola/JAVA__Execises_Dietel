package TryoutsAgain;

import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        System.out.println("How many scores do you want to enter: ");
        Scanner input = new Scanner(System.in);
        int scoreSize = input.nextInt();
        int[] grades = new int[scoreSize];

        for (int i = 0; i < grades.length; i++) {
            System.out.println("Enter number " + (i+1));
            grades[i] = input.nextInt();
        }

        System.out.println(calculateTotalOf(grades));
        System.out.println(calculateAverageOf(grades));
        System.out.println(findLargestNumberFrom(grades));
        System.out.println(findSmallestNumberFrom(grades));
    }

    public static int calculateTotalOf(int[] grades) {
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }
        return total;
    }

    public static double calculateAverageOf(int[] grades) {
        return (double) (calculateTotalOf(grades)) / grades.length;
    }

    public static int findSmallestNumberFrom(int[] grades) {
        int smallestNumber = grades[0];
        for (int grade : grades){
            if(smallestNumber > grade){
                smallestNumber = grade;
            }
        }
        return smallestNumber;
    }

    public static int findLargestNumberFrom(int[] grades) {
        int largestNumber = grades[0];
        for (int grade : grades) {
            if (largestNumber < grade) {
                largestNumber = grade;
            }
        }
        return largestNumber;
    }
}
