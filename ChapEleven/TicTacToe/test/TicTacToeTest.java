package TicTacToe.test;

import static TicTacToe.src.Player.*;
import TicTacToe.src.*;

import org.junit.jupiter.api.Test;
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
    void testThatGameCanSwitchCurrentPlayer() {
        assertEquals(PLAYER_TWO, ticTacToe.switchCurrentPlayer(PLAYER_ONE));
    }

    @Test
    void testThatPlayerOneCanPlay() {
        ticTacToe.playerMove(PLAYER_ONE, 2);
        assertEquals("X", ticTacToe.getPlayBoard()[0][1]);
    }

    @Test
    void testThatPlayerOneCannotPlayOutsideThePlayBoard() {
        assertThrows(IndexOutOfBoundsException.class, ()-> ticTacToe.playerMove(PLAYER_ONE, 10));
    }

    @Test
    void testThatPlayerTwoCanPlay() {
        ticTacToe.playerMove(Player.PLAYER_TWO,9);
        assertEquals("O", ticTacToe.getPlayBoard()[2][2]);
    }

    @Test
    void testThatPlayerTwoCannotPlayOutsideThePlayBoard() {
        assertThrows(IndexOutOfBoundsException.class, ()-> ticTacToe.playerMove(PLAYER_TWO, 10));
    }

    @Test
    void testThatPlayerCannotPlayOnAFilledPosition() {
        ticTacToe.playerMove(PLAYER_ONE,1);
        assertEquals("X", ticTacToe.getPlayBoard()[0][0]);
        assertThrows(IllegalArgumentException.class, ()-> ticTacToe.playerMove(PLAYER_TWO, 1));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOneOnFirstRow() {
        ticTacToe.playerMove(PLAYER_ONE, 1);
        ticTacToe.playerMove(PLAYER_ONE, 2);
        ticTacToe.playerMove(PLAYER_ONE, 3);
        assertTrue(GameStatus.firstRow(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOneOnSecondRow() {
        ticTacToe.playerMove(PLAYER_TWO, 4);
        ticTacToe.playerMove(PLAYER_TWO, 5);
        ticTacToe.playerMove(PLAYER_TWO, 6);
        assertTrue(GameStatus.secondRow(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOneOnThirdRow() {
        ticTacToe.playerMove(PLAYER_ONE, 9);
        ticTacToe.playerMove(PLAYER_ONE, 7);
        ticTacToe.playerMove(PLAYER_ONE, 8);
        assertTrue(GameStatus.thirdRow(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOneOnFirstColumn() {
        ticTacToe.playerMove(PLAYER_TWO, 1);
        ticTacToe.playerMove(PLAYER_TWO, 4);
        ticTacToe.playerMove(PLAYER_TWO, 7);
        assertTrue(GameStatus.firstColumn(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOneOnSecondColumn() {
        ticTacToe.playerMove(PLAYER_ONE, 5);
        ticTacToe.playerMove(PLAYER_ONE, 2);
        ticTacToe.playerMove(PLAYER_ONE, 8);
        assertTrue(GameStatus.secondColumn(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOneOnThirdColumn() {
        ticTacToe.playerMove(PLAYER_TWO, 6);
        ticTacToe.playerMove(PLAYER_TWO, 9);
        ticTacToe.playerMove(PLAYER_TWO, 3);
        assertTrue(GameStatus.thirdColumn(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOneOnLeftDiagonal() {
        ticTacToe.playerMove(PLAYER_ONE, 1);
        ticTacToe.playerMove(PLAYER_ONE, 5);
        ticTacToe.playerMove(PLAYER_ONE, 9);
        assertTrue(GameStatus.leftDiagonal(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOneOnRightDiagonal() {
        ticTacToe.playerMove(PLAYER_TWO, 3);
        ticTacToe.playerMove(PLAYER_TWO, 5);
        ticTacToe.playerMove(PLAYER_TWO, 7);
        assertTrue(GameStatus.rightDiagonal(ticTacToe.getPlayBoard()));
    }
}