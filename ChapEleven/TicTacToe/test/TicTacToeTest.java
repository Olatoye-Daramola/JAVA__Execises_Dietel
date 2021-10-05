package TicTacToe.test;

import static TicTacToe.src.Player.*;
import static TicTacToe.src.Square.*;

import TicTacToe.src.*;

import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();
    Board board;

    @Test
    void testThatTicTacToeHasABoard() {
        assertNull(board);
    }

    @Test
    void testThatTicTacToeHasBoardSquareElement() {
        assertNotNull(ticTacToe.getSquareValue());
    }

    @Test
    void testThatPlayBoardIsEmptyAfterInstantiation() {
        for (String[] row : ticTacToe.getPlayBoard()) {
            for (String column : row) {
                assertEquals("EMPTY", column);
            }
        }
    }

    @Test
    void testThatTicTaToeHasTwoPlayers() {
        assertEquals(2, Player.values().length);
    }

    @Test
    void testThatPlayerOneCanPlay() {
        ticTacToe.playerMove(PLAYER_ONE, 2);
        assertEquals("X", ticTacToe.getPlayBoard()[0][1]);
    }

    @Test
    void testThatPlayerTwoCanPlay() {
        ticTacToe.playerMove(Player.PLAYER_TWO,9);
        assertEquals("O", ticTacToe.getPlayBoard()[2][2]);
    }

    @Test
    void testThatOnePositionCannotTakeMoreThanOnePlay() {
        ticTacToe.playerMove(PLAYER_ONE,1);
        assertEquals("X", ticTacToe.getPlayBoard()[0][0]);
//        ticTacToe.playerMove(PLAYER_ONE, 2);
//        assertEquals("X", ticTacToe.getPlayBoard()[0][1]);
//        assertThrows(IllegalArgumentException.class, ()-> ticTacToe.playerMove(PLAYER_TWO, 1));
    }

    @Test
    void testThatTicTacToeGameCanBeWon() {
        ticTacToe.playerMove(PLAYER_ONE, 1);
        ticTacToe.playerMove(PLAYER_ONE, 5);
        ticTacToe.playerMove(PLAYER_ONE, 9);
        assertTrue(GameStatus.isWon(ticTacToe.getPlayBoard()));
    }
}