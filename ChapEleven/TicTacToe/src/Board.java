package TicTacToe.src;

import java.util.Arrays;

import static TicTacToe.src.Square.EMPTY;

public class Board {
    static String[][] board = new String[3][3];

    public Board(Square square) {
        for (String[] strings : board) {
            Arrays.fill(strings, String.valueOf(square));
        }
    }

    public String[][] getBoard() {
        return board;
    }
}
