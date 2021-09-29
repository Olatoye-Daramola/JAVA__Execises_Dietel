package SevenSegmentDisplay;

import Turtle_graphics.src.Position;

import java.util.Arrays;
import java.util.InputMismatchException;

public class SevenSegmentDisplay {

    public static final int[][] SCREEN = new int[5][4];
    private static final int NUMBER_OF_DIGITS_IN_USER_INPUT = 8;
    private static final int[] ARRAY_FROM_USER_INPUT = new int[NUMBER_OF_DIGITS_IN_USER_INPUT];

    public static void getUserInput(String userInput) {
        if (userInput.length() <= 8) {
            for (int index = 0; index < NUMBER_OF_DIGITS_IN_USER_INPUT; index++) {
                if (Character.getNumericValue(userInput.charAt(index)) == 0 ||
                        Character.getNumericValue(userInput.charAt(index)) == 1) {
                    ARRAY_FROM_USER_INPUT[index] = Integer.parseInt(String.valueOf(userInput.charAt(index)));
                } else {
                    throw new InputMismatchException("Enter 0s and 1s only");
                }
            }
        } else {
            throw new ArrayIndexOutOfBoundsException("8-bit binary number only");
        }
    }

    public static void setScreen(String userInput) {
        getUserInput(userInput);
        for (int[] row : SCREEN) {
            for (int column = 0; column < row.length; column++) {
                if (ARRAY_FROM_USER_INPUT[7] == 1) {
                    fillSegments();
                } else {
                    clearScreen();
                }
            }
        }
    }

    private static void fillSegments() {
        if (ARRAY_FROM_USER_INPUT[0] == 1) {
            firstSegment();
        }
        if (ARRAY_FROM_USER_INPUT[1] == 1) {
            secondSegment();
        }
        if (ARRAY_FROM_USER_INPUT[2] == 1) {
            thirdSegment();
        }
        if (ARRAY_FROM_USER_INPUT[3] == 1) {
            fourthSegment();
        }
        if (ARRAY_FROM_USER_INPUT[4] == 1) {
            fifthSegment();
        }
        if (ARRAY_FROM_USER_INPUT[5] == 1) {
            sixthSegment();
        }
        if (ARRAY_FROM_USER_INPUT[6] == 1) {
            seventhSegment();
        }
    }

    private static void firstSegment() {
        SCREEN[0][0] = 1;
        SCREEN[0][1] = 1;
        SCREEN[0][2] = 1;
        SCREEN[0][3] = 1;
    }

    private static void secondSegment() {
        SCREEN[0][3] = 1;
        SCREEN[1][3] = 1;
        SCREEN[2][3] = 1;
    }

    private static void thirdSegment() {
        SCREEN[2][3] = 1;
        SCREEN[3][3] = 1;
        SCREEN[4][3] = 1;
    }

    private static void fourthSegment() {
        SCREEN[4][3] = 1;
        SCREEN[4][2] = 1;
        SCREEN[4][1] = 1;
        SCREEN[4][0] = 1;
    }

    private static void fifthSegment() {
        SCREEN[4][0] = 1;
        SCREEN[3][0] = 1;
        SCREEN[2][0] = 1;
    }

    private static void sixthSegment() {
        SCREEN[2][0] = 1;
        SCREEN[1][0] = 1;
        SCREEN[0][0] = 1;
    }

    private static void seventhSegment() {
        SCREEN[2][0] = 1;
        SCREEN[2][1] = 1;
        SCREEN[2][2] = 1;
        SCREEN[2][3] = 1;
    }

    private static void clearScreen() {
        for (int[] row : SCREEN) {
            Arrays.fill(row, 0);
        }
    }

    public static void display() {
        for (int[] row : SCREEN) {
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

//Test that each segment prints
//Test that input cannot be more than eight
//Test that input is truly binary
//Test that it can add leading zeros