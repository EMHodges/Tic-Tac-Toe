import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoardTest {



    @Test
    void addMove() {
    }

    @Test
    void isValidMove() {
    }

    @Test
    void isWinner() {
    }

    @Test
    void testIsDiagonalWin() {
        Board board = new Board();
        board.addMove(Counter.Nought, 0,0);
        board.addMove(Counter.Nought,1,1);
        board.addMove(Counter.Nought,2,2);
        Assertions.assertTrue(board.isDiagonalWin());

        Board board1 = new Board();
        board1.addMove(Counter.Nought, 0,2);
        board1.addMove(Counter.Nought, 1,1);
        board1.addMove(Counter.Nought, 2,0);
        Assertions.assertTrue(board1.isDiagonalWin());

        Board board2 = new Board();
        board2.addMove(Counter.Cross, 0,2);
        board2.addMove(Counter.Nought, 1,1);
        board2.addMove(Counter.Nought, 2,0);
        Assertions.assertFalse(board2.isDiagonalWin());

        Board board3 = new Board();
        Assertions.assertFalse(board3.isDiagonalWin());
    }

    @Test
    void testIsRowWin() {
        Board board = new Board();
        Assertions.assertFalse(board.isRowWin());

        board.addMove(Counter.Nought, 0,0);
        board.addMove(Counter.Nought, 0,1);
        board.addMove(Counter.Nought, 0,2);
        Assertions.assertTrue(board.isRowWin());

        Board board2 = new Board();
        board2.addMove(Counter.Nought,0, 0);
        board2.addMove(Counter.Nought,1, 0);
        board2.addMove(Counter.Nought,2, 0);
        Assertions.assertFalse(board2.isRowWin());

        Board board3 = new Board();
        board3.addMove(Counter.Nought, 0,0);
        board3.addMove(Counter.Nought, 1,1);
        board3.addMove(Counter.Nought, 2,2);
        Assertions.assertFalse(board3.isRowWin());

        Board board4 = new Board();
        board4.addMove(Counter.Cross, 0, 0);
        board4.addMove(Counter.Nought, 0,1);
        board4.addMove(Counter.Cross, 0, 2);
        Assertions.assertFalse(board4.isRowWin());

    }

    @Test
    void testIsColumnWin() {
        Board board = new Board();
        Assertions.assertFalse(board.isColumnWin());

        board.addMove(Counter.Nought, 0,0);
        board.addMove(Counter.Nought, 1,0);
        board.addMove(Counter.Nought, 2,0);
        Assertions.assertTrue(board.isColumnWin());

        Board board2 = new Board();
        board2.addMove(Counter.Nought,0, 0);
        board2.addMove(Counter.Nought,0, 1);
        board2.addMove(Counter.Nought,0, 2);
        Assertions.assertFalse(board2.isColumnWin());

        Board board3 = new Board();
        board3.addMove(Counter.Nought, 0,0);
        board3.addMove(Counter.Nought, 1,1);
        board3.addMove(Counter.Nought, 2,2);
        Assertions.assertFalse(board3.isColumnWin());

        Board board4 = new Board();
        board4.addMove(Counter.Cross, 0, 0);
        board4.addMove(Counter.Nought, 1,0);
        board4.addMove(Counter.Cross, 2, 0);
        Assertions.assertFalse(board4.isRowWin());
    }

}