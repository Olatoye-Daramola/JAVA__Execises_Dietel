package TicTacToe.src;

import static TicTacToe.src.CellValue.*;

import java.util.Arrays;

public class Board {
    String[][] board;

    public Board(int boardRow, int boardColumn) {
        board = new String[boardRow][boardColumn];
    }

    public String[][] getBoard() {
        return board;
    }

    public void setBoard(String valueOfPlayer, int row, int column) {
        board[row][column] = valueOfPlayer;
    }
}
