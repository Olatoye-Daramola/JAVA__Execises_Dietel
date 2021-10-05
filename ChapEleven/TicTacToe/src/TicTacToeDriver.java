package TicTacToe.src;

import java.util.Scanner;

import static TicTacToe.src.Square.*;
import static TicTacToe.src.Player.*;

public class TicTacToeDriver {
    private static TicTacToe ticTacToe = new TicTacToe();
    private static Board board = new Board(EMPTY);
    private static String[][] playBoard = board.getBoard();
    private static boolean continueGame = GameStatus.isWon(playBoard);
    private static Player player = PLAYER_TWO;


    public static void main(String[] args) {
        String currentPlayer = "";

        while (!continueGame) {
            player = getCurrentPlayer(player);
                if (player == PLAYER_ONE) currentPlayer = "Player 1";
                else currentPlayer = "Player 2";

                ticTacToe.playerMove(player, input(currentPlayer));
                continueGame = GameStatus.isWon(playBoard);
                ticTacToe.displayBoard();
        }
        System.out.println(currentPlayer + " WINS!");
    }

    private static Player getCurrentPlayer(Player player) {
            if (player == PLAYER_ONE) {
                player = PLAYER_TWO;
            } else {
                player = PLAYER_ONE;
            }
    return player;
    }

    private static int input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
}
