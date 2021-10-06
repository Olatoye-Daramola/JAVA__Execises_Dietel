package TicTacToe.src;

import java.util.Objects;

import static TicTacToe.src.Player.*;
import static TicTacToe.src.Square.*;

public class TicTacToe {
    private Square square = EMPTY;
    private Board board = new Board(square);
    private String[][] playBoard = board.getBoard();

    public Square getSquareValue() {
        return square;
    }

    public Player switchCurrentPlayer(Player player) {
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

    public boolean canAdd(int row, int column) {
        return playBoard[row][column].equals(EMPTY.name());
    }

    private void validateInput(int row, int column, Square square) {
        if (!canAdd(row, column)) throw new IllegalArgumentException("Cannot play in a filled position");
        else playBoard[row][column] = String.valueOf(square);
    }

    private void setSquarePosition(int position, Square square) {
        switch (position) {
            case 1 -> validateInput(0, 0, square);
            case 2 -> validateInput(0, 1, square);
            case 3 -> validateInput(0, 2, square);
            case 4 -> validateInput(1, 0, square);
            case 5 -> validateInput(1, 1, square);
            case 6 -> validateInput(1, 2, square);
            case 7 -> validateInput(2, 0, square);
            case 8 -> validateInput(2, 1, square);
            case 9 -> validateInput(2, 2, square);
        }
    }

    public void squarePosition(int position, Square square) {
        setSquarePosition(position, square);
    }

    public void playerMove(Player player, int position) {
        if (position > 0 && position < 10) {
            if (player == Player.PLAYER_ONE) squarePosition(position, X);
            else squarePosition(position, O);
        } else throw new IndexOutOfBoundsException("Enter a position between 1 and 9");
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
