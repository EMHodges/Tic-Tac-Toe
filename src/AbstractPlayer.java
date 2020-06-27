public abstract class AbstractPlayer {

    Player playerID;
    Counter playerCounter;

    AbstractPlayer(Player playerID, Counter playerCounter) {
        this.playerCounter = playerCounter;
        this.playerID = playerID;
    }

    public boolean validateInput(int row, int column) {
        if (!(row >= 0 && row <= 2)) return false;
        if (!(column >= 0 && column <= 2)) return false;
        return true;
    }

    public abstract void takeTurn (Board board);

}
