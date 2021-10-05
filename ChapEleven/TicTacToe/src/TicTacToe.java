package TicTacToe.src;

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
        for (int row = 0; row < playBoard.length; row++) {
            for (int column = 0; column < playBoard[row].length; column++) {
//                if (playBoard[row][column] != String.valueOf(EMPTY)) {
                    setSquarePosition(position, square);
//                } else {
//                    throw new IllegalArgumentException("Cannot play in a filled position");
//                }
            }
        }
    }

    public void playerMove(Player player, int position) {
        if (player == Player.PLAYER_ONE) squarePosition(position, X);
        else squarePosition(position, O);
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
