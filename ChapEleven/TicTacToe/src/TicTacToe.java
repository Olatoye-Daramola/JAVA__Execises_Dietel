package TicTacToe.src;

import static TicTacToe.src.Player.*;
import static TicTacToe.src.Square.*;

public class TicTacToe {
    private Square square;
    private Board board = new Board();
    private Square[][] playBoard = board.getBoard();
    private Player currentPlayer = PLAYER_ONE;

    public Square[][] getPlayBoard() {
        return playBoard;
    }

    public Square getSquareValue() {
        return square;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void changeCurrentPlayer() {
        if (currentPlayer == PLAYER_ONE) currentPlayer = PLAYER_TWO;
        else currentPlayer = PLAYER_ONE;
    }

    public boolean canAdd(int row, int column) {
        return playBoard[row][column].equals(EMPTY);
    }

    private void validateInput(int row, int column, Square square) throws IllegalArgumentException {
        if (!canAdd(row, column)) throw new IllegalArgumentException("Cannot play in a filled position");
        else playBoard[row][column] = square;
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

    public void playerPlay(Player player, int position) throws IndexOutOfBoundsException{
        if (position >= 1 && position <= 9) {
            if (player == Player.PLAYER_ONE) squarePosition(position, X);
            else squarePosition(position, O);
        } else throw new IndexOutOfBoundsException("Enter a position within the inclusive range of 1 and 9");
    }

    public StringBuilder displayBoard() {
        StringBuilder displayBoard = new StringBuilder();
        for (Square[] row : playBoard) {
            displayBoard.append("| ");
            for (Square column : row) {
                if (column == EMPTY) {
                    displayBoard.append("_");
                } else displayBoard.append(column);
                displayBoard.append(" | ");
            }
            displayBoard.append("\n");
        }
        return displayBoard;
    }
}
