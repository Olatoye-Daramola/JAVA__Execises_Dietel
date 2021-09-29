package SevenSegmentDisplay;

import java.util.Arrays;

public class SevenSegmentDisplay {
    private static final int[][] screen = new int[5][4];
    private static final int NUMBER_OF_DIGITS_IN_USER_INPUT = 8;
    private static final int[] arrayFromUserInput = new int[NUMBER_OF_DIGITS_IN_USER_INPUT];

    public static void setScreen(String userInput) {
        for (int index = 0; index < NUMBER_OF_DIGITS_IN_USER_INPUT; index++) {
            arrayFromUserInput[index] = Integer.parseInt(String.valueOf(userInput.charAt(index)));
        }

        for (int[] row : screen) {
            for (int column = 0; column < row.length; column++) {
                if (arrayFromUserInput[7] == 1) {
                    fillSegments();
                } else {
                    clearScreen();
                }
            }
        }
    }

    private static void fillSegments() {
        if (arrayFromUserInput[0] == 1) {
            firstSegment();
        }
        if (arrayFromUserInput[1] == 1) {
            secondSegment();
        }
        if (arrayFromUserInput[2] == 1) {
            thirdSegment();
        }
        if (arrayFromUserInput[3] == 1) {
            fourthSegment();
        }
        if (arrayFromUserInput[4] == 1) {
            fifthSegment();
        }
        if (arrayFromUserInput[5] == 1) {
            sixthSegment();
        }
        if (arrayFromUserInput[6] == 1) {
            seventhSegment();
        }
    }

    private static void firstSegment() {
        screen[0][0] = 1;
        screen[0][1] = 1;
        screen[0][2] = 1;
        screen[0][3] = 1;
    }

    private static void secondSegment() {
        screen[0][3] = 1;
        screen[1][3] = 1;
        screen[2][3] = 1;
    }

    private static void thirdSegment() {
        screen[2][3] = 1;
        screen[3][3] = 1;
        screen[4][3] = 1;
    }

    private static void fourthSegment() {
        screen[4][3] = 1;
        screen[4][2] = 1;
        screen[4][1] = 1;
        screen[4][0] = 1;
    }

    private static void fifthSegment() {
        screen[4][0] = 1;
        screen[3][0] = 1;
        screen[2][0] = 1;
    }

    private static void sixthSegment() {
        screen[2][0] = 1;
        screen[1][0] = 1;
        screen[0][0] = 1;
    }

    private static void seventhSegment() {
        screen[2][0] = 1;
        screen[2][1] = 1;
        screen[2][2] = 1;
        screen[2][3] = 1;
    }

    private static void clearScreen() {
        for (int[] row : screen) {
            Arrays.fill(row, 0);
        }
    }

    public static void display() {
        for (int[] row : screen) {
            for (int column : row) {
                if (column == 1) {
                    System.out.print(column + "  ");
                } else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
