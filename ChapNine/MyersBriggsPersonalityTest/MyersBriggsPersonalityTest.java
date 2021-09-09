package TryoutsAgain;


import java.util.Scanner;

public class MyersBriggsPersonalityTest {

    private static final int ROW = 20;
    private static final int COLUMN = 2;
    private static String[] answersArray;

    public static void getUserResponse() {
        String[][] questionsArray = Questions.questionsArray();
        answersArray= new String[ROW];

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
    }

    private static int[][] defineArray(){
        int[][] recordsArray = new int[ROW][COLUMN];

        for (int row = 0; row < recordsArray.length; row++) {
            for (int column = 0; column < recordsArray[row].length; column++) {
                if (answersArray[row].equals("a")) {
                    recordsArray[row][0] = 1;
                    recordsArray[row][1] = 0;
//                    ✔➖
                } else if (answersArray[row].equals("b")){
                    recordsArray[row][0] = 0;
                    recordsArray[row][1] = 1;
                }
            }
        }
        return recordsArray;
    }

    public static void displayArray() {
        for (int row = 0; row <= 3; row++) {
            System.out.printf("%5s ", " ");
            for (int column = 0; column < 2; column++) {
                if (column == 0) {
                    System.out.printf("%3s", "A");
                } else {
                    System.out.printf("%3s", "B");
                }
            }
        }

        System.out.println();

        int[][] recordsArray = defineArray();
        String[][] stringOfRecordsArray = new String[ROW][COLUMN];
        for (int row = 0; row < recordsArray.length; row++) {
            System.out.printf("%5d|", row + 1);
            for (int column = 0; column < recordsArray[row].length; column++) {
                if (recordsArray[row][column] == 1) {
                    stringOfRecordsArray[row][column] = "✔";
                } else {
                    stringOfRecordsArray[row][column] = "";
                }
                System.out.printf("%3s", stringOfRecordsArray[row][column]);
            }
            if((row + 1) % 4 == 0) {
                System.out.println();
            }

        }

        demarcator();

        int[][] sumsArray = getSumsOfColumnsOf();
        for (int[] row : sumsArray) {
            System.out.printf("%5s|", " ");
            for (int column : row) {
                System.out.printf("%3d", column);
            }
        }
    }

    public static int[][] getSumsOfColumnsOf() {
        int[][] recordsArray = defineArray();
        int[][] firstGroup = new int[5][2];
        int[][] columnSum = new int [4][2];
        int sumOfA = 0, sumOfB = 0;
        int i = 0;
        for (int mainRow = 0; mainRow < 4; mainRow++) {
            for (int row = mainRow; row < recordsArray.length; row += 4) {
                System.arraycopy(recordsArray[row], 0, firstGroup[i], 0, recordsArray[row].length);
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

    private static void displayPersonalityResult() {
        
    }

    public static String input() {
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    private static void demarcator() {
        System.out.print("=".repeat(50));
        System.out.println();
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public static void main(String[] args) {
        getUserResponse();
        clearScreen();
        displayArray();
        displayPersonalityResult();
    }
}