public class Game {

    public Board board;
    public Player turn;

    public AbstractPlayer playerOne;
    public AbstractPlayer playerTwo;

    public static void main(String args[]) {
        Game game = new Game();
        game.setup();

    }

    public Game () {
        board = new Board();
        turn = Player.PLAYER_ONE;
        playerOne = new HumanPlayer(Player.PLAYER_ONE, Counter.Cross);
        playerTwo = new AIPlayer(Player.PLAYER_TWO, Counter.Nought);
    }

    private void setup() {
        playerOne.takeTurn(board);
        playerTwo.takeTurn(board);
    }

}