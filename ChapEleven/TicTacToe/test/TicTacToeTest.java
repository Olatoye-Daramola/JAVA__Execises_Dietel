package TicTacToe.test;

import static TicTacToe.src.CellValue.*;

import TicTacToe.src.*;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TicTacToeTest {
    TicTacToe ticTacToe = new TicTacToe();
    Board board;

    @Test
    void testThatTicTacToeHasABoard() {
        assertNull(ticTacToe.getBoard());
    }

    @Test
    void testThatTicTacToeHasBoardElement() {
        assertNotNull(ticTacToe.getCellValue());
    }

    @Test
    void testThatTicTaToeHasTwoPlayers() {
        assertEquals(2, Player.values().length);
    }

    @Test
    void testThatPlayerOneCanPlay() {
        ticTacToe.playerOneMove(2, 1);
        assertEquals(X, ticTacToe.getCellValue());
        assertEquals(new CellValuePosition(2, 1), ticTacToe.getPosition());
    }

//    @Test
//    void testThatPlayerTwoCanPlay() {
//        ticTacToe.playerTwoMove();
//        assertEquals(O, ticTacToe.getCellValue());
//    }

//    @Test
//    void testThatPlayingBoardIsEmpty() {
//        for (String[] row : board.getBoard()) {
//            for (String column : row) {
//                assertEquals("EMPTY", column);
//            }
//        }
//    }

//    @Test
//    void testThatPlayingBoardIsEmpty() {
//        assertNull(Arrays.deepToString(ticTacToe.getBoard()));
//    }
}