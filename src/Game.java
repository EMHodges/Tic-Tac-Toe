public class Game {

    public Board board;

    public static void main(String args[]) {
        Game game = new Game();
        game.setup();

    }

    public Game () {
        board = new Board();
    }

    private void setup() {
        System.out.print(board.toString());
    }

}