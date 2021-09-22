package TryoutsAgain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import static TryoutsAgain.Direction.*;
import static TryoutsAgain.PenPosition.*;
import static org.junit.jupiter.api.Assertions.*;


public class TurtleTest {
    Turtle ijapa;
    Pen pen;

    @BeforeEach
    public void setUp() {
        ijapa = new Turtle();
        pen = ijapa.getPen();
    }

    @Test
    public void testThatTurtleHasAPen() {
        //assert
        assertNotNull(pen);
    }

    @Test
    public void testThatPenIsUpByDefault() {
        //assert
        assertSame(UP, pen.getPosition());
    }

    @Test
    public void testThatTurtleCanMovePenDown() {
        //given
        assertSame(UP, pen.getPosition());
        //when
        ijapa.penDown();
        //assert
        assertSame(DOWN, ijapa.getPen().getPosition());
    }

    @Test
    public void testThatTurtleCanMovePenUp() {
        //given
        ijapa.penDown();
        assertSame(DOWN, ijapa.getPen().getPosition());
        //when
        ijapa.penUp();
        //assert
        assertSame(UP, ijapa.getPen().getPosition());
    }

    @Test
    @DisplayName("Turtle can turn right while facing East test")
    public void testThatTurtleCanTurnRight1() {
        //given
        assertSame(EAST, ijapa.getCurrentDirection());
        //when
        ijapa.turnRight();
        //assert
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing South test")
    public void testThatTurtleCanTurnRight2() {
        //given
        ijapa.turnRight();
        //when
        ijapa.turnRight();
        //assert
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing West test")
    public void testThatTurtleCanTurnRight3() {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        //when
        ijapa.turnRight();
        //assert
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn right while facing North test")
    public void testThatTurtleCanTurnRight4() {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        //when
        ijapa.turnRight();
        //assert
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn LEFT while facing East test")
    public void testThatTurtleCanTurnLeft1() {
        //given

        //when
        ijapa.turnLeft();
        //assert
        assertSame(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing North test")
    public void testThatTurtleCanTurnLeft2() {
        //given
        ijapa.turnLeft();
        //when
        ijapa.turnLeft();
        //assert
        assertSame(WEST, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing West test")
    public void testThatTurtleCanTurnLeft3() {
        //given
        ijapa.turnLeft();
        ijapa.turnLeft();
        //when
        ijapa.turnLeft();
        //assert
        assertSame(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    @DisplayName("Turtle can turn left while facing East test")
    public void testThatTurtleCanTurnLeft4() {
        //given
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        //when
        ijapa.turnLeft();
        //assert
        assertSame(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void testThatTurtleCanMoveForwardWhileFacingEast() {
        //given
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
    }
}
