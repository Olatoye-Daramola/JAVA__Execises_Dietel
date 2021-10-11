package TicTacToe.src;

import java.util.InputMismatchException;
import java.util.Scanner;

import static TicTacToe.src.Player.*;

public class TicTacToeDriver {
    private static TicTacToe ticTacToe = new TicTacToe();
    private static Board board = new Board();
    private static Square[][] playBoard = board.getBoard();
    private static int movesCounter = 0;
    private static boolean stopGame = GameStatus.hasWon(playBoard) || GameStatus.isDraw(playBoard, movesCounter);
    private static String currentPlayer = "";

    public static void main(String... args) {

        while (!stopGame) {
            Player player = ticTacToe.getCurrentPlayer();
            if (player == PLAYER_ONE) currentPlayer = "Player 1";
            else currentPlayer = "Player 2";
            takeMoveFrom(player);
            ++movesCounter;
            stopGame = GameStatus.hasWon(playBoard) || GameStatus.isDraw(playBoard, movesCounter);
            System.out.println(ticTacToe.displayBoard());
            ticTacToe.changeCurrentPlayer();
        }
        announceGameOutcome();
    }

    private static void takeMoveFrom(Player player) {
        try {
            ticTacToe.playerPlay(player, input(currentPlayer));
        }
        catch (IndexOutOfBoundsException | IllegalArgumentException es) {
            System.err.println(es.getMessage());
            takeMoveFrom(player);
        }
        catch (InputMismatchException inputMismatchException) {
            System.err.println("Entry can only an integer between 1 and 9");
            takeMoveFrom(player);
        }
    }

    private static void announceGameOutcome() {
        GameStatus.setMessage(playBoard, currentPlayer, movesCounter);
        System.out.println(GameStatus.getMessage());
    }

    private static int input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
}
