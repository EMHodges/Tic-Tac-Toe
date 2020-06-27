public abstract class AbstractPlayer {

    Player playerID;
    Counter playerCounter;

    AbstractPlayer(Player playerID, Counter playerCounter) {
        this.playerCounter = playerCounter;
        this.playerID = playerID;
    }

    public abstract void takeTurn (Board board);

}
