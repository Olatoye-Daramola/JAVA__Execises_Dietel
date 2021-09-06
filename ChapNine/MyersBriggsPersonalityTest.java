package TryoutsAgain;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class MyersBriggsPersonalityTest {

    private static int row = 20;
    private static int column = 2;

    private static int[][] getArray (){
//        String[] questionsArray = new String[row];
        String[] questionsArray = {"a", "a", "b", "a", "b", "a", "b", "a", "a", "b", "a", "b", "b", "a", "b", "a", "a",
                "b", "a", "a", "b", "a"};
        int[][] answersArray = new int[row][column];

        for (row = 0; row < answersArray.length; row++) {
//            System.out.println("Question " + (row + 1));
//            questionsArray[row] = input();
            for (column = 0; column < answersArray[row].length; column++) {
                if (Objects.equals(questionsArray[row], "a")) {
                    answersArray[row][0] = 1;
                    answersArray[row][1] = 0;
                } else if (Objects.equals(questionsArray[row], "b")){
                    answersArray[row][0] = 0;
                    answersArray[row][1] = 1;
                }
            }
//            System.out.println();
        }
        return answersArray;
    }

    public static void displayArray(int[][] answersArray) {
        for (row = 0; row < answersArray.length; row+= 4) {
            for (column = row; column < row + 4; column++) {
                System.out.printf("%5d", (column + 1));
                System.out.print(Arrays.toString(answersArray[column]));
            }
            System.out.println();
        }
    }

    public static int[][] findColumnSumOf(int[][] answersArray) {
        int[][] totals = new int[5][column];
        int sumOfA = 0, sumOfB = 0;
        for (int row = 0; row < answersArray.length; row++) {
            for (int column = 0; column < row; column++) {
                sumOfA += answersArray[row][0];
                sumOfB += answersArray[row][1];
                totals[row][0] = sumOfA;
                totals[row][1] = sumOfB;
            }
        }
        return totals;
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
//        clearScreen();
//        System.out.println(Arrays.deepToString(getArray()));
        displayArray(getArray());
        System.out.println(Arrays.deepToString(findColumnSumOf(getArray())));
    }
}
