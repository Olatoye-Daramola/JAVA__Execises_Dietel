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
    public boolean equals(Object otherPosition) {
        if (otherPosition == null) return false;
        if (!otherPosition.getClass().isInstance(this)) return false;

        Position comparedPosition = (Position) otherPosition;
        boolean columnsAreEqual = columnPosition == comparedPosition.columnPosition;
        boolean rowsAreEqual = rowPosition == comparedPosition.rowPosition;

        return columnsAreEqual & rowsAreEqual;
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
