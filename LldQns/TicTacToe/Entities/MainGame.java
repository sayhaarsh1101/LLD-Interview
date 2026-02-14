package LldQns.TicTacToe.Entities;

import java.util.ArrayDeque;
import java.util.Deque;

public class MainGame {

    public static void main(String[] args) {
        Deque<Player> players = new ArrayDeque<>();

        players.offerLast(new Player("Harsh", PieceType.X));
        players.offerLast(new Player("Shivam", PieceType.O));


        GameController game = new GameController(3, players);
        game.playGame();
    }
    
}
