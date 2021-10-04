package TicTacToe.src;


public class CellValuePosition {
        private int rowPosition;
        private int columnPosition;

        public CellValuePosition(int rowPosition, int columnPosition) {
            this.rowPosition = rowPosition;
            this.columnPosition = columnPosition;
        }

        @Override
        public String toString() {
            return "Position{rowPosition=" + rowPosition +
                    ", columnPosition=" + columnPosition +
                    "}";
        }

        @Override
        public boolean equals(Object otherPosition) {
            if (otherPosition == null) return false;
            if (!otherPosition.getClass().isInstance(this)) return false;

            CellValuePosition comparedPosition = (CellValuePosition) otherPosition;
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
