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
    }

    @Test
    void isRowWin() {
    }

    @Test
    void isColumnWin() {
    }
}