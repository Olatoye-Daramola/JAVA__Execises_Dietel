package SevenSegmentDisplay;

import java.util.Scanner;

public class SevenSegmentDisplayDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number");
        String userInput = scanner.next();
//        String userInput = "11111111";

        SevenSegmentDisplay.setScreen(userInput);
        SevenSegmentDisplay.display();
    }
}
