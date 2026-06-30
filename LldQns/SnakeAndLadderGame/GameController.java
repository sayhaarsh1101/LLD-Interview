package LldQns.SnakeAndLadderGame;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class GameController {

    private Board board;
    private Dice dice;
    private Deque<Player> players;

    public GameController(Board board, Dice dice, List<Player> playerList){
        this.board = board;
        this.dice = dice;
        this.players = new ArrayDeque<>(playerList);
    }

    public void playGame(){

        while(true){
            Player currPlayer = players.pollFirst();

            int roll = dice.roll();

            int finalPosition = currPlayer.getPosition() + roll;

            if(finalPosition > board.getSize()){
                System.out.println("Move exceeds the board size : remaining at same posn");
                players.offerLast(currPlayer);
            }

            finalPosition = board.resolvePostion(finalPosition);

            currPlayer.setPosition(finalPosition);

            if(finalPosition == board.getSize()){
                System.out.println("Winner is :" + currPlayer.getName());
                break;
            }

            players.offerLast(currPlayer);
        }
    }
    
}
