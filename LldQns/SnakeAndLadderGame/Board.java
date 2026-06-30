package LldQns.SnakeAndLadderGame;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Board {
    private int size;
    private Map<Integer, Integer> snakes;
    private Map<Integer, Integer> ladders;

    Board(int size, List<Snake> snakeList, List<Ladder> ladderList){
        this.size = size;
        this.snakes = new HashMap<>();
        this.ladders = new HashMap<>();

        for(Snake snake : snakeList){
            snakes.put(snake.getHead(), snake.getTail());
        }

        for(Ladder ladder : ladderList){
            ladders.put(ladder.getStart(), ladder.getEnd());
        }
    }

    public int getSize(){
        return size;
    }

    public int resolvePostion(int position){
        if(snakes.containsKey(position)){
            return snakes.get(position);
        }

        if(ladders.containsKey(position)){
            return ladders.get(position);
        }

        return position;
    } 
}
