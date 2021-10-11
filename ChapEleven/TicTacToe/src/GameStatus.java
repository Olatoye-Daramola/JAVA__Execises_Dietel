package TicTacToe.src;

import static TicTacToe.src.Square.EMPTY;

public class GameStatus {
    private Player currentPlayer;
    private Board board;
    private Square[][] playBoard;
    private static String message = "";

    {
        assert false;
        playBoard = board.getBoard();
    }

    public static boolean hasWon(Square[][] playBoard) {
        return verifyWinnerOnTheFirstRow(playBoard) ||
               verifyWinnerOnTheSecondRow(playBoard) ||
               verifyWinnerOnTheThirdRow(playBoard) ||

               verifyWinnerOnTheFirstColumn(playBoard) ||
               verifyWinnerOnTheSecondColumn(playBoard) ||
               verifyWinnerOnTheThirdColumn(playBoard) ||

               verifyWinnerOnTheLeftDiagonal(playBoard) ||
               verifyWinnerOnTheRightDiagonal(playBoard);
    }

    public static boolean isDraw(Square[][] playBoard, int numberOfMoves) {
        return !hasWon(playBoard) && numberOfMoves ==9;
    }

    public static void setMessage(Square[][] playBoard, String currentPlayer, int numberOfMoves) {
        if (!isDraw(playBoard, numberOfMoves)) message = currentPlayer + " WINS";
        else if (!hasWon(playBoard)) message = "The game is a tie";
    }

    public static String getMessage() {
        return message;
    }


    public static boolean verifyWinnerOnTheFirstRow(Square[][] playBoard) {
        return !playBoard[0][0].equals(EMPTY) &&
                playBoard[0][0].equals(playBoard[0][1]) && playBoard[0][0].equals(playBoard[0][2]);
    }

    public static boolean verifyWinnerOnTheSecondRow(Square[][] playBoard) {
        return !playBoard[1][0].equals(EMPTY) &&
                playBoard[1][0].equals(playBoard[1][1]) && playBoard[1][0].equals(playBoard[1][2]);
    }

    public static boolean verifyWinnerOnTheThirdRow(Square[][] playBoard) {
        return !playBoard[2][0].equals(EMPTY) &&
                playBoard[2][0].equals(playBoard[2][1]) && playBoard[2][0].equals(playBoard[2][2]);
    }

    public static boolean verifyWinnerOnTheFirstColumn(Square[][] playBoard) {
        return !playBoard[0][0].equals(EMPTY) &&
                playBoard[0][0].equals(playBoard[1][0]) && playBoard[0][0].equals(playBoard[2][0]);
    }

    public static boolean verifyWinnerOnTheSecondColumn(Square[][] playBoard) {
        return !playBoard[0][1].equals(EMPTY) &&
                playBoard[0][1].equals(playBoard[1][1]) && playBoard[0][1].equals(playBoard[2][1]);
    }

    public static boolean verifyWinnerOnTheThirdColumn(Square[][] playBoard) {
        return !playBoard[0][2].equals(EMPTY) &&
                playBoard[0][2].equals(playBoard[1][2]) && playBoard[0][2].equals(playBoard[2][2]);
    }

    public static boolean verifyWinnerOnTheLeftDiagonal(Square[][] playBoard) {
        return !playBoard[0][0].equals(EMPTY) &&
                playBoard[0][0].equals(playBoard[1][1]) && playBoard[0][0].equals(playBoard[2][2]);
    }

    public static boolean verifyWinnerOnTheRightDiagonal(Square[][] playBoard) {
        return !playBoard[0][2].equals(EMPTY) &&
                playBoard[0][2].equals(playBoard[1][1]) && playBoard[0][2].equals(playBoard[2][0]);
    }
}
