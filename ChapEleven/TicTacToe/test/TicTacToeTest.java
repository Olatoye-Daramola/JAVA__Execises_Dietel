package TicTacToe.test;

import static TicTacToe.src.Player.*;
import TicTacToe.src.*;

import org.junit.jupiter.api.Test;

import static TicTacToe.src.Square.*;
import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();

    @Test
    void testThatTicTacToeHasAPlayBoard() {
        assertNotNull(ticTacToe.getPlayBoard());
    }

    @Test
    void testThatTicTacToeHasBoardSquareValue() {
        assertNotNull(ticTacToe.getSquareValue());
    }

    @Test
    void testThatPlayBoardIsEmptyByDefault() {
        for (Square[] row : ticTacToe.getPlayBoard()) {
            for (Square column : row) {
                assertEquals(EMPTY, column);
            }
        }
    }

    @Test
    void testThatTicTaToeHasTwoPlayers() {
        assertEquals(2, ticTacToe.getCurrentPlayer().values().length);
    }

    @Test
    void testThatGameCanSwitchCurrentPlayer() {
        Player player = PLAYER_ONE;
        ticTacToe.changeCurrentPlayer();
        assertEquals(PLAYER_TWO, ticTacToe.getCurrentPlayer());
    }

    @Test
    void testThatPlayerOneCanMarkPlayBoard() {
        ticTacToe.playerPlay(PLAYER_ONE, 2);
        assertEquals(X, ticTacToe.getPlayBoard()[0][1]);
    }

    @Test
    void testThatPlayerOneCannotPlayOutsideThePlayBoard() {
        assertThrows(IndexOutOfBoundsException.class, ()-> ticTacToe.playerPlay(PLAYER_ONE, 10));
    }

    @Test
    void testThatPlayerTwoCanMarkPlayBoard() {
        ticTacToe.playerPlay(Player.PLAYER_TWO,9);
        assertEquals(O, ticTacToe.getPlayBoard()[2][2]);
    }

    @Test
    void testThatPlayerTwoCannotPlayOutsideThePlayBoard() {
        assertThrows(IndexOutOfBoundsException.class, ()-> ticTacToe.playerPlay(PLAYER_ONE, 10));
    }

    @Test
    void testThatPlayerCannotPlayOnAFilledPosition() {
        ticTacToe.playerPlay(PLAYER_ONE,1);
        assertEquals(X, ticTacToe.getPlayBoard()[0][0]);
        assertThrows(IllegalArgumentException.class, ()-> ticTacToe.playerPlay(PLAYER_TWO, 1));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOnFirstRow() {
        ticTacToe.playerPlay(PLAYER_ONE, 1);
        ticTacToe.playerPlay(PLAYER_ONE, 2);
        ticTacToe.playerPlay(PLAYER_ONE, 3);
        assertTrue(GameStatus.verifyWinnerOnTheFirstRow(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOnSecondRow() {
        ticTacToe.playerPlay(PLAYER_TWO, 4);
        ticTacToe.playerPlay(PLAYER_TWO, 5);
        ticTacToe.playerPlay(PLAYER_TWO, 6);
        assertTrue(GameStatus.verifyWinnerOnTheSecondRow(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOnThirdRow() {
        ticTacToe.playerPlay(PLAYER_ONE, 9);
        ticTacToe.playerPlay(PLAYER_ONE, 7);
        ticTacToe.playerPlay(PLAYER_ONE, 8);
        assertTrue(GameStatus.verifyWinnerOnTheThirdRow(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOnFirstColumn() {
        ticTacToe.playerPlay(PLAYER_TWO, 1);
        ticTacToe.playerPlay(PLAYER_TWO, 4);
        ticTacToe.playerPlay(PLAYER_TWO, 7);
        assertTrue(GameStatus.verifyWinnerOnTheFirstColumn(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOnSecondColumn() {
        ticTacToe.playerPlay(PLAYER_ONE, 5);
        ticTacToe.playerPlay(PLAYER_ONE, 2);
        ticTacToe.playerPlay(PLAYER_ONE, 8);
        assertTrue(GameStatus.verifyWinnerOnTheSecondColumn(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOnThirdColumn() {
        ticTacToe.playerPlay(PLAYER_TWO, 6);
        ticTacToe.playerPlay(PLAYER_TWO, 9);
        ticTacToe.playerPlay(PLAYER_TWO, 3);
        assertTrue(GameStatus.verifyWinnerOnTheThirdColumn(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOnLeftDiagonal() {
        ticTacToe.playerPlay(PLAYER_ONE, 1);
        ticTacToe.playerPlay(PLAYER_ONE, 5);
        ticTacToe.playerPlay(PLAYER_ONE, 9);
        assertTrue(GameStatus.verifyWinnerOnTheLeftDiagonal(ticTacToe.getPlayBoard()));
    }

    @Test
    void testThatTicTacToeGameCanBeWonOnRightDiagonal() {
        ticTacToe.playerPlay(PLAYER_TWO, 3);
        ticTacToe.playerPlay(PLAYER_TWO, 5);
        ticTacToe.playerPlay(PLAYER_TWO, 7);
        assertTrue(GameStatus.verifyWinnerOnTheRightDiagonal(ticTacToe.getPlayBoard()));
    }

//    @Test
//    void testThatTicTacToeCanDisplayBoard() {
//        StringBuilder prompt = new StringBuilder("""
//                | _ | _ | _ |\s
//                | _ | _ | _ |\s
//                | _ | _ | _ |\s
//                """);
//        assertEquals(prompt, ticTacToe.displayBoard());
//    }
}