public enum Counter {

    Cross("X"),
    Nought("O"),
    Null (" ");

    private String counterRepresentation;

    Counter(String counterRepresentation) {
        this.counterRepresentation = counterRepresentation;
    }

    public String getCounterRepresentation() {
        return counterRepresentation;
    }

}

