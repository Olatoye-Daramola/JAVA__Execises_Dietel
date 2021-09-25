package Turtle_graphics.src;

public class Position {
    private final int ROW_POSITION;
    private final int COLUMN_POSITION;

    public Position(int ROW_POSITION, int COLUMN_POSITION) {
        this.ROW_POSITION = ROW_POSITION;
        this.COLUMN_POSITION = COLUMN_POSITION;
    }

    @Override
    public String toString() {
        return "Position{" + "rowPosition=" + ROW_POSITION +
                ", columnPosition=" + COLUMN_POSITION +
                "}";
    }

//    @Override
    
}
