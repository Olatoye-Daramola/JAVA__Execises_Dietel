package TicTacToe.src;

import static TicTacToe.src.Square.EMPTY;

public class GameStatus {
    Board board;
    String[][] playBoard = board.getBoard();

    public static boolean isWon(String[][] playBoard) {
        return firstRow(playBoard) ||
               secondRow(playBoard) ||
               thirdRow(playBoard) ||

               firstColumn(playBoard) ||
               secondColumn(playBoard) ||
               thirdColumn(playBoard) ||

               leftDiagonal(playBoard) ||
               rightDiagonal(playBoard);
    }


    public static boolean firstRow(String[][] playBoard) {
        return playBoard[0][0] != String.valueOf(EMPTY) && playBoard[0][0] == playBoard[0][1] && playBoard[0][0] == playBoard[0][2];
    }

    public static boolean secondRow(String[][] playBoard) {
        return playBoard[1][0] != String.valueOf(EMPTY) && playBoard[1][0] == playBoard[1][1] && playBoard[1][0] == playBoard[1][2];
    }

    public static boolean thirdRow(String[][] playBoard) {
        return playBoard[2][0] != String.valueOf(EMPTY) && playBoard[2][0] == playBoard[2][1] && playBoard[2][0] == playBoard[2][2];
    }

    public static boolean firstColumn(String[][] playBoard) {
        return playBoard[0][0] != String.valueOf(EMPTY) && playBoard[0][0] == playBoard[1][0] && playBoard[0][0] == playBoard[2][0];
    }

    public static boolean secondColumn(String[][] playBoard) {
        return playBoard[0][1] != String.valueOf(EMPTY) && playBoard[0][1] == playBoard[1][1] && playBoard[0][1] == playBoard[2][1];
    }

    public static boolean thirdColumn(String[][] playBoard) {
        return playBoard[0][2] != String.valueOf(EMPTY) && playBoard[0][2] == playBoard[1][2] && playBoard[0][2] == playBoard[2][2];
    }

    public static boolean leftDiagonal(String[][] playBoard) {
        return playBoard[0][0] != String.valueOf(EMPTY) && playBoard[0][0] == playBoard[1][1] && playBoard[0][0] == playBoard[2][2];
    }

    public static boolean rightDiagonal(String[][] playBoard) {
        return playBoard[0][2] != String.valueOf(EMPTY) && playBoard[0][2] == playBoard[1][1] && playBoard[0][2] == playBoard[2][0];
    }
}
