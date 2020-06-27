public enum Player {

    PLAYER_ONE(1), PLAYER_TWO(2);

    int playerID;

    Player(int playerID) {
        this.playerID = playerID;
    }

    public int getPlayerID() {
        return playerID;
    }
}
