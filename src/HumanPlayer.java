public class HumanPlayer extends AbstractPlayer {

    HumanPlayer(Player playerID, Counter playerCounter) {
        super(playerID, playerCounter);
    }

    @Override
    public void takeTurn(Board board) {
        System.out.print("Human");
    }
}
