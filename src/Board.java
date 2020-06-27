public class Board {

    private Counter board[][];

    public Board() {
        board = new Counter[][]{
                {Counter.Null, Counter.Null, Counter.Null},
                {Counter.Null, Counter.Null, Counter.Null},
                {Counter.Null, Counter.Null, Counter.Null}};
    }

    @Override
    public String toString() {
        String output = "+-+-+-+\n";
        for (int row = 0; row < board.length; row++) {
            output += String.format("|%s|%s|%s|\n", board[row][0].getCounterRepresentation(), board[row][1].getCounterRepresentation(), board[row][2].getCounterRepresentation());
            output += "+-+-+-+\n";
        }
        return output;
    }

    public void addMove(Counter counter, int row, int column) {
        if (isValidMove(row, column)) board[row][column] = counter;
        else throw new IllegalArgumentException("Invalid input");
    }

    public boolean isValidMove(int row, int column) {
        return (board[row][column].equals(Counter.Null));
    }

    // check if there are any empty cells

    public boolean isWinner() {
        if (isDiagonalWin()) return true;
        if (isRowWin()) return true;
        if (isColumnWin()) return true;
        return false;
    }

    public boolean isDiagonalWin() {
        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) ||
                board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            return true;
        }
        return false;
    }

    public boolean isRowWin() {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2])){
                return true;
            }
        }
        return false;
    }

    public boolean isColumnWin() {
        for (int column = 0; column < board.length; column++) {
            if (board[0][column].equals(board[1][column]) && board[1][column].equals(board[2][column])){
                return true;
            }
        }
        return false;
    }

}
