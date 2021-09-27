package Turtle_graphics.src;

public class Position {
    private int ROW_POSITION;
    private int COLUMN_POSITION;

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

    public void increaseColumnPositionBy(int numberOfSteps) {
        COLUMN_POSITION += numberOfSteps;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( !(o instanceof Position comparedPosition)) {
            return false;
        }
        boolean rowsAreEqual = ROW_POSITION == comparedPosition.ROW_POSITION;
        boolean columnsAreEqual = COLUMN_POSITION == comparedPosition.COLUMN_POSITION;
        return rowsAreEqual && columnsAreEqual;
    }
}
