public enum Player {

    PLAYER_ONE(1, Counter.Nought), PLAYER_TWO(2, Counter.Cross);

    int playerID;
    Counter counter;

    Player(int playerID, Counter counter) {
        this.playerID = playerID;
        this.counter = counter;
    }

    public int getPlayerID() {
        return playerID;
    }

    public Counter getCounter() {
        return counter;
    }
}
