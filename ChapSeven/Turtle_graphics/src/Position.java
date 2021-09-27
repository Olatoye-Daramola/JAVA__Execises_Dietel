package Turtle_graphics.src;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    @Override
    public String toString() {
        return "Position{" + "rowPosition=" + rowPosition +
                ", columnPosition=" + columnPosition +
                "}";
    }

//    public void increaseColumnPositionBy(int numberOfSteps) {
//        columnPosition += numberOfSteps;
//    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( !(o instanceof Position comparedPosition)) {
            return false;
        }
        boolean rowsAreEqual = rowPosition == comparedPosition.rowPosition;
        boolean columnsAreEqual = columnPosition == comparedPosition.columnPosition;
        return rowsAreEqual && columnsAreEqual;
    }

    public int getColumnPosition() {
        return columnPosition;
    }

    public void setColumnPosition(int columnPosition) {
        this.columnPosition = columnPosition;
    }

    public int getRowPosition() {
        return rowPosition;
    }

    public void setRowPosition(int rowPosition) {
        this.rowPosition = rowPosition;
    }
}
