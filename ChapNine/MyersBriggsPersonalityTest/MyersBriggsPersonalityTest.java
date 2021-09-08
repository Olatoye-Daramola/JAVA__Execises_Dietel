package TryoutsAgain;


import java.util.Objects;
import java.util.Scanner;

public class MyersBriggsPersonalityTest {

    private static int row = 20;
    private static int column = 2;

    public static String[] throwQuestionsFrom() {
        String[][] questionsArray= Questions.questionsArray();
        String[] answersArray= new String[row];

        for (int row = 0; row < questionsArray.length;row++) {
            System.out.println("QUESTION " + (row + 1));
            for (int column = 0; column < questionsArray[row].length; column++) {
                if (column == 0) {
                    System.out.print("A.\t");
                } else {
                    System.out.print("B.\t");
                }
                System.out.printf("%5s\n", questionsArray[row][column]);
            }
            answersArray[row] = input().toLowerCase();
            System.out.println();
            clearScreen();
        }
        return answersArray;
    }

    private static int[][] getArray (){
//        String[] answersArray = throwQuestionsFrom();
        String[] answersArray = new String[]{"a", "a", "b", "a", "b", "a", "b", "a", "a", "b", "a", "b", "b", "a", "b", "a", "a",
                "b", "a", "a", "b", "a"};
        int[][] recordsArray = new int[row][column];

        for (row = 0; row < recordsArray.length; row++) {
            for (column = 0; column < recordsArray[row].length; column++) {
                if (Objects.equals(answersArray[row], "a")) {
                    recordsArray[row][0] = 1;
                    recordsArray[row][1] = 0;
//                    ✔➖
                } else if (Objects.equals(answersArray[row], "b")){
                    recordsArray[row][0] = 0;
                    recordsArray[row][1] = 1;
                }
            }
        }
        return recordsArray;
    }

    public static void displayArray() {
        demarcator("_");

        int[][] recordsArray = getArray();
        for (int row = 0; row < recordsArray.length; row++) {
            System.out.printf("%5d|", row + 1);
            for (int column = 0; column < recordsArray[row].length; column++) {
                System.out.printf("%3s", recordsArray[row][column]);
            }
            if((row + 1) % 4 == 0) {
                System.out.println();
            }

        }

        demarcator("-");

        int[][] sumsArray = getSumsOfColumnsOf();
        for (int row = 0; row < sumsArray.length; row++) {
            System.out.printf("%5s|", " ");
            for (int column = 0; column < sumsArray[row].length; column++) {
                System.out.printf("%3d", sumsArray[row][column]);
            }
        }
    }

    public static int[][] getSumsOfColumnsOf() {
        int[][] recordsArray = getArray();
        int[][] firstGroup = new int[5][2];
        int[][] columnSum = new int [4][2];
        int sumOfA = 0, sumOfB = 0;
        int i = 0;
        for (int mainRow = 0; mainRow < 4; mainRow++) {
            for (int row = mainRow; row < recordsArray.length; row += 4) {
                for (int column = 0; column < recordsArray[row].length; column++) {
                    firstGroup[i][column] = recordsArray[row][column];
                }
                sumOfA += firstGroup[i][0];
                sumOfB += firstGroup[i][1];

                columnSum[mainRow][0] = sumOfA;
                columnSum[mainRow][1] = sumOfB;
            }
            i++;
            sumOfA = 0;
            sumOfB = 0;
        }
        return columnSum;
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static void demarcator(String sign) {
        System.out.print(sign.repeat(50));
        System.out.println();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
//        clearScreen();
//        throwQuestionsFrom();
        displayArray();
//        System.out.println(Arrays.deepToString(getSumsOfColumnsOf()));
    }
}