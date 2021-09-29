package SevenSegmentDisplay;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SevenSegmentDisplayDriver {
    public static void main(String... args) {
        String userInput = getUserInput();

        try {
            SevenSegmentDisplay.setScreen(userInput);
        }
        catch (ArrayIndexOutOfBoundsException | InputMismatchException es) {
            System.err.println(es.getMessage());
            main();
        }

        SevenSegmentDisplay.display();
    }

    private static String getUserInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your 8-bit binary number");
        return scanner.next();
    }
}
