import java.util.Scanner;

public class HumanPlayer extends AbstractPlayer {

    HumanPlayer(Player playerID, Counter playerCounter) {
        super(playerID, playerCounter);
    }

    @Override
    public void takeTurn(Board board) {
        int row = validateInput("row");
        int column = validateInput("column");
        board.addMove(playerCounter, row, column);
    }

    public int validateInput(String isle) {
        Scanner scanner = new Scanner(System.in);
        int location;

        do {
            System.out.print(String.format("Please enter the %s where you want to insert your counter: ", isle));
            while (!scanner.hasNextInt()) {
                System.out.println("Not valid");
                scanner.next();
            }
            location = scanner.nextInt();
        } while (location < 0 || location > 2);

        return location;

    }

}
