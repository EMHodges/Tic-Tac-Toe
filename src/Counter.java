public enum Counter {

    Cross("X", 1),
    Nought("O", 3),
    Null (" ", 0);

    private String counterRepresentation;
    private int score;

    Counter(String counterRepresentation, int score) {
        this.counterRepresentation = counterRepresentation;
        this.score = score;
    }

    public String getCounterRepresentation() {
        return counterRepresentation;
    }

    public int getScore() {
        return score;
    }

}

