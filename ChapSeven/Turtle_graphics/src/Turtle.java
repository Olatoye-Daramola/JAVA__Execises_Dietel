package TryoutsAgain;

import static TryoutsAgain.Direction.*;
import static TryoutsAgain.PenPosition.*;


public class Turtle {
    private Pen pen = new Pen();
    private Direction currentDirection = Direction.EAST;
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
        if(currentDirection==NORTH) changeCurrentDirectionTo(EAST);
        else if(currentDirection==WEST) changeCurrentDirectionTo(NORTH);
        else if(currentDirection==SOUTH) changeCurrentDirectionTo(WEST);
        else if(currentDirection==EAST) changeCurrentDirectionTo(SOUTH);
    }

    public void turnLeft() {
        if(currentDirection==NORTH) changeCurrentDirectionTo(WEST);
        else if(currentDirection==WEST) changeCurrentDirectionTo(SOUTH);
        else if(currentDirection==SOUTH) changeCurrentDirectionTo(EAST);
        else if(currentDirection==EAST) changeCurrentDirectionTo(NORTH);
    }

    private void changeCurrentDirectionTo(Direction newDirection) {
        this.currentDirection = newDirection;
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }
}
