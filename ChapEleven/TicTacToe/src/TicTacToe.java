package TicTacToe.src;

import java.util.Arrays;

import static TicTacToe.src.Player.PLAYER_ONE;
import static TicTacToe.src.Player.PLAYER_TWO;
import static TicTacToe.src.Square.*;

public class TicTacToe {
    private Square square = EMPTY;
    private Board board = new Board(square);
    private String[][] playBoard = board.getBoard();

    public Board getBoard() {
        return board;
    }

    public Square getSquareValue() {
        return square;
    }

    public Player getCurrentPlayer(Player player) {
        if (player == PLAYER_ONE) {
            player = PLAYER_TWO;
        } else {
            player = PLAYER_ONE;
        }
        return player;
    }

    public String[][] getPlayBoard() {
        return playBoard;
    }

    private void setSquarePosition(int position, Square square) {
        switch (position) {
            case 1 -> playBoard[0][0] = String.valueOf(square);
            case 2 -> playBoard[0][1] = String.valueOf(square);
            case 3 -> playBoard[0][2] = String.valueOf(square);
            case 4 -> playBoard[1][0] = String.valueOf(square);
            case 5 -> playBoard[1][1] = String.valueOf(square);
            case 6 -> playBoard[1][2] = String.valueOf(square);
            case 7 -> playBoard[2][0] = String.valueOf(square);
            case 8 -> playBoard[2][1] = String.valueOf(square);
            case 9 -> playBoard[2][2] = String.valueOf(square);
        }
    }

    public void squarePosition(int position, Square square) {
        for (String[] row : playBoard) {
            for (int column = 0; column < row.length; column++) {
                setSquarePosition(position, square);
            }
        }
    }

    public void playerMove(Player player, int position) {
        if (position > 0 && position < 10) {
            if (player == Player.PLAYER_ONE) squarePosition(position, X);
            else squarePosition(position, O);
        } else throw new IllegalArgumentException("Enter a position between 1 and 9");
    }

    public boolean canAdd(int row, int column) {
        return playBoard[row][column] == String.valueOf(EMPTY);
//        throw new IllegalArgumentException("Cannot play in a filled position");
    }

    public void displayBoard() {
        for (String[] row : playBoard) {
            System.out.print("| ");
            for (String column : row) {
                if (column == String.valueOf(EMPTY)) {
                    System.out.print("_");
                } else System.out.print(column);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }
}
