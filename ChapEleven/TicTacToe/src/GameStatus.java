package TicTacToe.src;

import java.util.Objects;

import static TicTacToe.src.Square.EMPTY;

public class GameStatus {
    Player currentPlayer;
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

    public static boolean isDraw(String[][] playBoard, int numberOfMoves) {
        return !isWon(playBoard) && numberOfMoves ==9;
    }

    public static void getMessage(String[][] playBoard, String currentPlayer, int numberOfMoves) {
        if (!isDraw(playBoard, numberOfMoves)) System.out.println(currentPlayer + " WINS");
        else if (!isWon(playBoard)) System.out.println("The game is a tie");;
    }



    public static boolean firstRow(String[][] playBoard) {
        return !playBoard[0][0].equals(EMPTY.name()) &&
                playBoard[0][0].equals(playBoard[0][1]) && playBoard[0][0].equals(playBoard[0][2]);
    }

    public static boolean secondRow(String[][] playBoard) {
        return !playBoard[1][0].equals(EMPTY.name()) &&
                playBoard[1][0].equals(playBoard[1][1]) && playBoard[1][0].equals(playBoard[1][2]);
    }

    public static boolean thirdRow(String[][] playBoard) {
        return !playBoard[2][0].equals(EMPTY.name()) &&
                playBoard[2][0].equals(playBoard[2][1]) && playBoard[2][0].equals(playBoard[2][2]);
    }

    public static boolean firstColumn(String[][] playBoard) {
        return !playBoard[0][0].equals(EMPTY.name()) &&
                playBoard[0][0].equals(playBoard[1][0]) && playBoard[0][0].equals(playBoard[2][0]);
    }

    public static boolean secondColumn(String[][] playBoard) {
        return !playBoard[0][1].equals(EMPTY.name()) &&
                playBoard[0][1].equals(playBoard[1][1]) && playBoard[0][1].equals(playBoard[2][1]);
    }

    public static boolean thirdColumn(String[][] playBoard) {
        return !playBoard[0][2].equals(EMPTY.name()) &&
                playBoard[0][2].equals(playBoard[1][2]) && playBoard[0][2].equals(playBoard[2][2]);
    }

    public static boolean leftDiagonal(String[][] playBoard) {
        return !playBoard[0][0].equals(EMPTY.name()) &&
                playBoard[0][0].equals(playBoard[1][1]) && playBoard[0][0].equals(playBoard[2][2]);
    }

    public static boolean rightDiagonal(String[][] playBoard) {
        return !playBoard[0][2].equals(EMPTY.name()) &&
                playBoard[0][2].equals(playBoard[1][1]) && playBoard[0][2].equals(playBoard[2][0]);
    }
}
