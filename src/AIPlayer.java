public class AIPlayer extends AbstractPlayer {


    AIPlayer(Player playerID, Counter playerCounter) {
        super(playerID, playerCounter);
    }

    @Override
    public void takeTurn(Board board) {
        System.out.print("AI");
    }
}
