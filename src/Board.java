public class Board {

    private Counter board[][];
    private Player winner;

    public Board() {
        board = new Counter[][] {
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

    public boolean isGameOver() {
        return isWinner() || isDraw();
    }

    public boolean isWinner() {
        if (isDiagonalWin()) return true;
        if (isRowWin()) return true;
        if (isColumnWin()) return true;
        return false;
    }

    public boolean isDiagonalWin() {
        if (isEmpty()) return false;

        if (board[0][0].equals(board[1][1]) && board[1][1].equals(board[2][2]) ||
                board[0][2].equals(board[1][1]) && board[1][1].equals(board[2][0])) {
            setWinner(board[0][0]);
            return true;
        }

        return false;
    }

    private void setWinner(Counter counter) {
        if (counter == Player.PLAYER_ONE.getCounter()) winner = Player.PLAYER_ONE;
        else winner = Player.PLAYER_TWO;

    }

    private boolean isEmpty() {
        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                if (!board[row][column].equals(Counter.Null)) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean isRowWin() {
        for (int row = 0; row < board.length; row++) {
            if (board[row][0] != Counter.Null)
                if (board[row][0] == board[row][1] && board[row][1] == board[row][2]) return true;
        }
        return false;
    }

    public boolean isColumnWin() {
        for (int column = 0; column < board.length; column++) {
            if (board[0][column] != Counter.Null)
                if (board[0][column] == board[1][column] && board[1][column] == board[2][column]) return true;
        }
        return false;
    }

    public boolean isDraw() {
        if (isWinner()) return false;

        for (int row = 0; row < board.length; row++) {
            for (int column = 0; column < board.length; column++) {
                if (board[row][column] == Counter.Null) return false;
            }
        }
        return true;
    }

    public Counter[][] getBoard() {
        return this.board;
    }

}
