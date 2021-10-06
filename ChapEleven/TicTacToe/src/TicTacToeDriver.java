package TicTacToe.src;

import java.util.Scanner;

import static TicTacToe.src.Square.*;
import static TicTacToe.src.Player.*;

public class TicTacToeDriver {
    private static TicTacToe ticTacToe = new TicTacToe();
    private static Board board = new Board(EMPTY);
    private static String[][] playBoard = board.getBoard();
    private static boolean stopGame = GameStatus.isWon(playBoard);
    private static Player player = PLAYER_TWO;


    public static void main(String[] args) {
        String currentPlayer = "";

        while (!stopGame) {
            player = ticTacToe.getCurrentPlayer(player);
                if (player == PLAYER_ONE) currentPlayer = "Player 1";
                else currentPlayer = "Player 2";

                ticTacToe.playerMove(player, input(currentPlayer));
                stopGame = GameStatus.isWon(playBoard);
                ticTacToe.displayBoard();
        }
        System.out.println(currentPlayer + " WINS!");
    }

    private static int input(String prompt) {
        int input = 0;
//        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println(prompt);
            input = scanner.nextInt();
//        }
//        catch (IllegalArgumentException illegalArgumentException) {
//            System.out.println(illegalArgumentException.getMessage());
//            input(prompt);
//        }
        return input;
    }
}