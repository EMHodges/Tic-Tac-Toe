public class Game {

    public Board board;

    public AbstractPlayer playerOne;
    public AbstractPlayer playerTwo;

    public AbstractPlayer activePlayer;

    public static void main(String args[]) {
        Game game = new Game();
        game.play();

    }

    public Game() {
        board = new Board();
        playerOne = new HumanPlayer(Player.PLAYER_ONE, Counter.Cross);
        playerTwo = new HumanPlayer(Player.PLAYER_TWO, Counter.Nought);
        activePlayer = playerOne;
    }

    private void play() {
        while (!board.isGameOver()){
            activePlayer.takeTurn(board);
            displayBoard();
            switchPlayer();
        }
     }

    private void displayBoard() {
        System.out.print(board.toString());
    }


    private void switchPlayer() {
        if (activePlayer == playerOne) {
            activePlayer = playerTwo;
        } else {
            activePlayer = playerOne;
        }

    }

}