package SevenSegmentDisplay;

import java.util.Scanner;

public class SevenSegmentDisplayDriver {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        String userInput = scanner.next();
        String userInput = "01101111";

//        SevenSegmentDisplay sevenSegmentDisplay = new SevenSegmentDisplay();

        SevenSegmentDisplay.setScreen(userInput);
        SevenSegmentDisplay.display();
    }
}
