package TicTacToe.src;

import java.util.Arrays;


public class Board {
    static Square[][] arrayOfPlayBoard = new Square[3][3];

    public Board(Square square) {
        for (Square[] squares : arrayOfPlayBoard) {
            Arrays.fill(squares, square);
        }
    }

    public Square[][] getBoard() {
        return arrayOfPlayBoard;
    }
}
