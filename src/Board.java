import java.util.Arrays;

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


    public boolean isWinner() {
        return false;
    }
}
