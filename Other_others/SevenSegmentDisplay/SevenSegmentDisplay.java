package SevenSegmentDisplay;

import Turtle_graphics.src.Position;

import java.util.Arrays;
import java.util.InputMismatchException;

public class SevenSegmentDisplay {

    public static final int[][] SCREEN = new int[5][4];

    public static void getUserInput(String userInput) {
        if (userInput.length() > 8) throw new ArrayIndexOutOfBoundsException("8-bit binary number only");
        else {
            userInput = addTrailingZerosTo(userInput);
        }
        for (int index = 0; index < userInput.length(); index++) {
            char character = userInput.charAt(index);
            if (character == 0 || character == 1) throw new InputMismatchException("Enter 0s and 1s only");
        }
    }

    private static String addTrailingZerosTo(String userInput) {
        int input = Integer.parseInt(userInput);
        userInput = String.format("%08d", input);
        return userInput;
    }

    public static void setScreen(String userInput) {
        getUserInput(userInput);
        for (int[] row : SCREEN) {
            for (int column = 0; column < row.length; column++) {
                if (userInput.charAt(7) == 1) fillSegments(userInput);
                else clearScreen();
            }
        }
    }

    private static void fillSegments(String userInput) {
        if (userInput.charAt(0) == 1) {
            firstSegment();
        }
        if (userInput.charAt(1) == 1) {
            secondSegment();
        }
        if (userInput.charAt(2) == 1) {
            thirdSegment();
        }
        if (userInput.charAt(3) == 1) {
            fourthSegment();
        }
        if (userInput.charAt(4) == 1) {
            fifthSegment();
        }
        if (userInput.charAt(5) == 1) {
            sixthSegment();
        }
        if (userInput.charAt(6) == 1) {
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
