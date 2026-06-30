package LldQns.SnakeAndLadderGame;

import java.util.Arrays;
import java.util.List;

public class MainGame {
    public static void main(String[] args) {

        List<Snake>  snakeList = Arrays.asList(
            new Snake(99, 10),
            new Snake(70, 55),
            new Snake(52, 42),
            new Snake(25, 2)
        );

        List<Ladder> ladderList = Arrays.asList(
            new Ladder(6, 25),
            new Ladder(11, 40),
            new Ladder(60, 85),
            new Ladder(46, 90)
        );

        Board board = new Board(100, snakeList, ladderList);

        List<Player> playerList = Arrays.asList(
            new Player("Player 1", 0),
            new Player("Player 2", 0)
        );

        Dice dice = new Dice();

        GameController game = new GameController(board, dice, playerList);

    }
}
