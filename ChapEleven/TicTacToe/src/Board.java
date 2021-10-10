package TicTacToe.src;

import java.util.Arrays;

import static TicTacToe.src.Square.*;


public class Board {
    static Square[][] arrayOfPlayBoard = new Square[3][3];

    public Board() {
        for (Square[] squares : arrayOfPlayBoard) {
            Arrays.fill(squares, EMPTY);
        }
    }

    public Square[][] getBoard() {
        return arrayOfPlayBoard;
    }
}
