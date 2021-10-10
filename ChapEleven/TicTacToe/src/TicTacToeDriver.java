package TicTacToe.src;

import java.util.InputMismatchException;
import java.util.Scanner;

import static TicTacToe.src.Square.*;
import static TicTacToe.src.Player.*;

public class TicTacToeDriver {
    private static TicTacToe ticTacToe = new TicTacToe();
    private static Board board = new Board(EMPTY);
    private static Square[][] playBoard = board.getBoard();
    private static int movesCounter = 0;
    private static boolean stopGame = GameStatus.isWon(playBoard) || GameStatus.isDraw(playBoard,  movesCounter);
    private static String currentPlayer = "";


    public static void main(String... args) {

        while (!stopGame) {
            Player player = ticTacToe.getPlayer();
            if (player == PLAYER_ONE) currentPlayer = "Player 1";
            else currentPlayer = "Player 2";
            takeMoveFrom(player);
            ++movesCounter;
            stopGame = GameStatus.isWon(playBoard) || GameStatus.isDraw(playBoard, movesCounter);
            System.out.println(ticTacToe.displayBoard());
            ticTacToe.changeCurrentPlayer();
        }
        GameStatus.getMessage(playBoard, currentPlayer, movesCounter);
    }

    private static void takeMoveFrom(Player player) {
        try {
            ticTacToe.playerPlay(player, input(currentPlayer));
        }
        catch (IndexOutOfBoundsException | InputMismatchException | IllegalArgumentException es) {
            System.err.println(es.getMessage());
            takeMoveFrom(player);
        }
    }

    private static int input(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        return scanner.nextInt();
    }
}
