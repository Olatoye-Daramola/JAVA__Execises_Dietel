package TicTacToe.src;

import java.util.Arrays;

import static TicTacToe.src.CellValue.*;
import static TicTacToe.src.Player.*;

public class TicTacToe {
    private Board board;
    private CellValue cellValue = EMPTY;
    private CellValuePosition position = new CellValuePosition(0, 0);

    private Player player;

    public Board getBoard() {
        return board;
    }

    public CellValue getCellValue() {
        return cellValue;
    }

    public void playerOneMove(int rowPosition, int columnPosition) {
        position.setRowPosition(rowPosition);
        position.setColumnPosition(columnPosition);
        board.setBoard(String.valueOf(X), rowPosition, columnPosition);
    }

    public void playerTwoMove(int rowPosition, int columnPosition) {
            position.setRowPosition(rowPosition);
            position.setColumnPosition(columnPosition);
            board.setBoard(String.valueOf(X), rowPosition, columnPosition);
    }
//
//    public void playerMove(Player player, int rowPosition, int columnPosition) {
//        if (player == PLAYER_ONE) {
//            board.getBoard()[rowPosition][columnPosition] = String.valueOf(playerOneMove());
//        } else {
//            board.getBoard()[rowPosition][columnPosition] = String.valueOf(playerTwoMove());
//        }
//    }

    public CellValuePosition getPosition() {
        return position;
    }
}
