package Turtle_graphics.src;

import static Turtle_graphics.src.Direction.*;
import static Turtle_graphics.src.PenPosition.*;


public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0, 0);

    public Pen getPen() {
        return pen;
    }

    public void penDown() {
        pen.setPositionTo(DOWN);
    }

    public void penUp() {
        pen.setPositionTo(UP);
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight() {
        if (currentDirection == NORTH) changeCurrentDirectionTo(EAST);
        else if (currentDirection == WEST) changeCurrentDirectionTo(NORTH);
        else if (currentDirection == SOUTH) changeCurrentDirectionTo(WEST);
        else if (currentDirection == EAST) changeCurrentDirectionTo(SOUTH);
    }

    public void turnLeft() {
        if (currentDirection == NORTH) changeCurrentDirectionTo(WEST);
        else if (currentDirection == WEST) changeCurrentDirectionTo(SOUTH);
        else if (currentDirection == SOUTH) changeCurrentDirectionTo(EAST);
        else if (currentDirection == EAST) changeCurrentDirectionTo(NORTH);
    }

    private void changeCurrentDirectionTo(Direction newDirection) {
        this.currentDirection = newDirection;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

//    public void moveForward(int numberOfSteps) {
//        if (currentDirection == EAST) {
//            increaseColumnPositionBy(numberOfSteps);
//        }
//    }
//
//    private void increaseColumnPositionBy(int numberOfSteps) {
//        currentPosition.increaseColumnPositionBy(numberOfSteps);
//    }

    public void moveForward(int numberOfSteps) {
        if (currentDirection == EAST) {
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps);
        } else if (currentDirection == SOUTH) {
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps);
        } else if (currentDirection == WEST) {
            currentPosition.setColumnPosition(currentPosition.getColumnPosition() + numberOfSteps);
        } else if (currentDirection == NORTH) {
            currentPosition.setRowPosition(currentPosition.getRowPosition() + numberOfSteps);
        }
    }
}
