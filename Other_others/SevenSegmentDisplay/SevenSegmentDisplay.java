package SevenSegmentDisplay;

import java.util.Arrays;

public class SevenSegmentDisplay {
    private static final int[][] screen = new int[5][4];


    public static void setScreen(String userInput) {
        final int NUMBER_OF_DIGITS_IN_USER_INPUT = 8;

        char[] userNumberToArray = new char[NUMBER_OF_DIGITS_IN_USER_INPUT];
        for (int index = 0; index < NUMBER_OF_DIGITS_IN_USER_INPUT; index++) {
            userNumberToArray[index] = userInput.charAt(index);
        }

        char a = userNumberToArray[0];
        char b = userNumberToArray[1];
        char c = userNumberToArray[2];
        char d = userNumberToArray[3];
        char e = userNumberToArray[4];
        char f = userNumberToArray[5];
        char g = userNumberToArray[6];
        char h = userNumberToArray[7];

        for (int row = 0; row < screen.length; row++) {
            for (int column = 0; column < screen[row].length; column++) {
                if (h == 1) {
                    if (a == 1) {
                        screen[0][0] = 1;
                        screen[0][1] = 1;
                        screen[0][2] = 1;
                        screen[0][3] = 1;
                    }
                    if (b == 1) {
                        screen[0][3] = 1;
                        screen[1][3] = 1;
                        screen[2][3] = 1;
                    }
                    if (c == 1) {
                        screen[2][3] = 1;
                        screen[3][3] = 1;
                        screen[4][3] = 1;
                    }
                    if (d == 1) {
                        screen[4][3] = 1;
                        screen[4][2] = 1;
                        screen[4][1] = 1;
                        screen[4][0] = 1;
                    }
                    if (e == 1) {
                        screen[4][0] = 1;
                        screen[3][0] = 1;
                        screen[2][0] = 1;
                    }
                    if (f == 1) {
                        screen[2][0] = 1;
                        screen[1][0] = 1;
                        screen[0][0] = 1;
                    }
                    if (g == 1) {
                        screen[2][0] = 1;
                        screen[2][1] = 1;
                        screen[2][2] = 1;
                        screen[2][3] = 1;
                    }
                } else {
                    clearScreen();
                }
            }
        }
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

    public static void main(String[] args) {
        String userInput = "01101111";

        SevenSegmentDisplay.setScreen(userInput);
        SevenSegmentDisplay.display();

    }
}


//    SevenSegmentDisplay.SevenSegmentDisplay();
//    setScreen();
//    display();  8 in 5by4 array
//    clear();  clear console

//    DriverClass();
//    collect user input            parseToInteger
//    display.userInput
//    loop through numbers and try to display