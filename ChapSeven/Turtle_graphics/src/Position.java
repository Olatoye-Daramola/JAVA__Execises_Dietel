package TryoutsAgain;

public class Position {
    private int rowPosition;
    private int columnPosition;

    public Position(int rowPosition, int columnPosition) {
        this.rowPosition = rowPosition;
        this.columnPosition = columnPosition;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Position{");
        sb.append("rowPosition=").append(rowPosition);
        sb.append(", columnPosition=").append(columnPosition);
        sb.append("}");
        return sb.toString();
    }

    @Override
    
}
