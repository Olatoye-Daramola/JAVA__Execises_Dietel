package TicTacToe.src;

import static TicTacToe.src.Square.EMPTY;

public class GameStatus {
    Player currentPlayer;
    Board board;
    Square[][] playBoard;

    {
        assert false;
        playBoard = board.getBoard();
    }

    public static boolean isWon(Square[][] playBoard) {
        return firstRow(playBoard) ||
               secondRow(playBoard) ||
               thirdRow(playBoard) ||

               firstColumn(playBoard) ||
               secondColumn(playBoard) ||
               thirdColumn(playBoard) ||

               leftDiagonal(playBoard) ||
               rightDiagonal(playBoard);
    }

    public static boolean isDraw(Square[][] playBoard, int numberOfMoves) {
        return !isWon(playBoard) && numberOfMoves ==9;
    }

    public static void getMessage(Square[][] playBoard, String currentPlayer, int numberOfMoves) {
        if (!isDraw(playBoard, numberOfMoves)) System.out.println(currentPlayer + " WINS");
        else if (!isWon(playBoard)) System.out.println("The game is a tie");
    }



    public static boolean firstRow(Square[][] playBoard) {
        return !playBoard[0][0].equals(EMPTY) &&
                playBoard[0][0].equals(playBoard[0][1]) && playBoard[0][0].equals(playBoard[0][2]);
    }

    public static boolean secondRow(Square[][] playBoard) {
        return !playBoard[1][0].equals(EMPTY) &&
                playBoard[1][0].equals(playBoard[1][1]) && playBoard[1][0].equals(playBoard[1][2]);
    }

    public static boolean thirdRow(Square[][] playBoard) {
        return !playBoard[2][0].equals(EMPTY) &&
                playBoard[2][0].equals(playBoard[2][1]) && playBoard[2][0].equals(playBoard[2][2]);
    }

    public static boolean firstColumn(Square[][] playBoard) {
        return !playBoard[0][0].equals(EMPTY) &&
                playBoard[0][0].equals(playBoard[1][0]) && playBoard[0][0].equals(playBoard[2][0]);
    }

    public static boolean secondColumn(Square[][] playBoard) {
        return !playBoard[0][1].equals(EMPTY) &&
                playBoard[0][1].equals(playBoard[1][1]) && playBoard[0][1].equals(playBoard[2][1]);
    }

    public static boolean thirdColumn(Square[][] playBoard) {
        return !playBoard[0][2].equals(EMPTY) &&
                playBoard[0][2].equals(playBoard[1][2]) && playBoard[0][2].equals(playBoard[2][2]);
    }

    public static boolean leftDiagonal(Square[][] playBoard) {
        return !playBoard[0][0].equals(EMPTY) &&
                playBoard[0][0].equals(playBoard[1][1]) && playBoard[0][0].equals(playBoard[2][2]);
    }

    public static boolean rightDiagonal(Square[][] playBoard) {
        return !playBoard[0][2].equals(EMPTY) &&
                playBoard[0][2].equals(playBoard[1][1]) && playBoard[0][2].equals(playBoard[2][0]);
    }
}
