package Turtle_graphics.test;

import Turtle_graphics.src.SketchPad;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Turtle_graphics.src.Pen;
import Turtle_graphics.src.Position;
import Turtle_graphics.src.Turtle;
import static Turtle_graphics.src.Direction.*;
import static Turtle_graphics.src.PenPosition.*;
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
        assertSame(EAST, ijapa.getCurrentDirection());
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanMoveForwardWhileFacingSouth() {
        //given
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanMoveForwardWhileFacingWest() {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert
        assertEquals(new Position(0, 4), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanMoveForwardWhileFacingNorth() {
        //given
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        assertEquals(new Position(0, 0), ijapa.getCurrentPosition());
        //when
        ijapa.moveForward(5);
        //assert
        assertEquals(new Position(4, 0), ijapa.getCurrentPosition());
    }

    @Test
    public void testThatTurtleCanWriteOnSketchpadWhileFacingEast(){
        //given
        ijapa.penDown();
        assertSame(EAST, ijapa.getCurrentDirection());
        SketchPad sketchPad = new SketchPad(5, 5);
        //when
        ijapa.writeOn(sketchPad, 3);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[0][1]);
        assertEquals(1, floor[0][2]);
        assertEquals(0, floor[0][3]);
        assertEquals(new Position(0,2), ijapa.getCurrentPosition());

        sketchPad.displayFloor();
    }

    @Test
    public void testThatTurtleCanWriteOnSketchpadWhileFacingSouth(){
        //given
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.penDown();
        ijapa.writeOn(sketchPad, 3);

        //when
        ijapa.turnRight();
        assertSame(SOUTH, ijapa.getCurrentDirection());
        ijapa.writeOn(sketchPad, 3);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][2]);
        assertEquals(1, floor[1][2]);
        assertEquals(1, floor[2][2]);
        assertEquals(0, floor[3][2]);
        assertEquals(new Position(2,2), ijapa.getCurrentPosition());

        sketchPad.displayFloor();
    }

    @Test
    public void testThatTurtleCanWriteOnSketchpadWhileFacingWest(){
        //given
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.penDown();
        ijapa.writeOn(sketchPad, 3);

        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 3);

        //when
        ijapa.turnRight();
        assertSame(WEST, ijapa.getCurrentDirection());
        ijapa.writeOn(sketchPad, 3);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[2][0]);
        assertEquals(1, floor[2][1]);
        assertEquals(1, floor[2][2]);
        assertEquals(0, floor[2][3]);
        assertEquals(new Position(2,0), ijapa.getCurrentPosition());

        System.out.println(ijapa.getCurrentPosition());
        sketchPad.displayFloor();
    }

    @Test
    public void testThatTurtleCanWriteOnSketchpadWhileFacingNorth(){
        //given
        SketchPad sketchPad = new SketchPad(5, 5);
        ijapa.penDown();
        ijapa.writeOn(sketchPad, 3);

        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 3);

        ijapa.turnRight();
        ijapa.writeOn(sketchPad, 3);

        //when
        ijapa.turnRight();
        assertSame(NORTH, ijapa.getCurrentDirection());
        ijapa.writeOn(sketchPad, 3);
        //assert
        int[][] floor = sketchPad.getFloor();
        assertEquals(1, floor[0][0]);
        assertEquals(1, floor[1][0]);
        assertEquals(1, floor[2][0]);
        assertEquals(0, floor[3][0]);
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());

        System.out.println(ijapa.getCurrentPosition());
        sketchPad.displayFloor();
    }
}
