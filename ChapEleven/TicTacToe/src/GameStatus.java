package TicTacToe.src;

import static TicTacToe.src.Square.EMPTY;

public class GameStatus {
    Board board;
    String[][] playBoard = board.getBoard();;


    public static boolean isWon(String[][] playBoard) {
        return (playBoard[0][0] != String.valueOf(EMPTY) && playBoard[0][0] == playBoard[1][1] && playBoard[0][0] == playBoard[2][2]) ||
                (playBoard[0][0] != String.valueOf(EMPTY) && playBoard[0][0] == playBoard[0][1] && playBoard[0][0] == playBoard[0][2]) ||
                (playBoard[0][0] != String.valueOf(EMPTY) && playBoard[0][0] == playBoard[1][0] && playBoard[0][0] == playBoard[2][0]) ||

                (playBoard[1][0] != String.valueOf(EMPTY) && playBoard[1][0] == playBoard[1][1] && playBoard[1][0] == playBoard[1][2]) ||
                (playBoard[2][0] != String.valueOf(EMPTY) && playBoard[2][0] == playBoard[2][1] && playBoard[2][0] == playBoard[2][2]) ||

                (playBoard[0][1] != String.valueOf(EMPTY) && playBoard[0][1] == playBoard[1][1] && playBoard[0][1] == playBoard[2][1]) ||
                (playBoard[0][2] != String.valueOf(EMPTY) && playBoard[0][2] == playBoard[1][2] && playBoard[0][2] == playBoard[2][2]) ||

                (playBoard[0][2] != String.valueOf(EMPTY) && playBoard[0][2] == playBoard[1][1] && playBoard[0][2] == playBoard[2][0]);
    }
}
