package SevenSegmentDisplay;

import Mp3Player.Mp3Player;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SevenSegmentDisplayTest {

//    @Test
//    void testThatNumberOfBinaryDigitsCannotExceed8() {
//        String userInput ="111111111";
//        assertSame(arrayIndexOutOfBoundsException, SevenSegmentDisplay.getUserInput(userInput));
//    }

//    @Test


    @Test
    void testThatFirstSegmentCanDisplay() {
        String userInput = "10000001";
        SevenSegmentDisplay.setScreen(userInput);
        assertEquals(1, SevenSegmentDisplay.SCREEN[0][0]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[0][1]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[0][2]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[0][3]);
    }

    @Test
    void testThatSecondSegmentCanDisplay() {
        String userInput = "01000001";
        SevenSegmentDisplay.setScreen(userInput);
        assertEquals(1, SevenSegmentDisplay.SCREEN[0][3]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[1][3]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[2][3]);
    }

    @Test
    void testThatThirdSegmentCanDisplay() {
        String userInput = "00100001";
        SevenSegmentDisplay.setScreen(userInput);
        assertEquals(1, SevenSegmentDisplay.SCREEN[2][3]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[3][3]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[4][3]);
    }

    @Test
    void testThatFourthSegmentCanDisplay() {
        String userInput = "00010001";
        SevenSegmentDisplay.setScreen(userInput);
        assertEquals(1, SevenSegmentDisplay.SCREEN[4][0]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[4][1]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[4][2]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[4][3]);
    }

    @Test
    void testThatFifthSegmentCanDisplay() {
        String userInput = "00001001";
        SevenSegmentDisplay.setScreen(userInput);
        assertEquals(1, SevenSegmentDisplay.SCREEN[2][0]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[3][0]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[4][0]);
    }

    @Test
    void testThatSixthSegmentCanDisplay() {
        String userInput = "00000101";
        SevenSegmentDisplay.setScreen(userInput);
        assertEquals(1, SevenSegmentDisplay.SCREEN[0][0]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[1][0]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[2][0]);
    }

    @Test
    void testThatSeventhSegmentCanDisplay() {
        String userInput = "00000011";
        SevenSegmentDisplay.setScreen(userInput);
        assertEquals(1, SevenSegmentDisplay.SCREEN[2][0]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[2][1]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[2][2]);
        assertEquals(1, SevenSegmentDisplay.SCREEN[2][3]);
    }

//    @Test
//    void testThatUserInputIsTrulyBinary() {
//
//    }
}