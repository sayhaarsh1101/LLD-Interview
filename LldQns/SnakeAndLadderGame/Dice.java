package LldQns.SnakeAndLadderGame;

import java.util.Random;

public class Dice {
    private int min = 1;
    private int max = 6;
    private Random random = new Random();


    public int roll(){
        return random.nextInt(max - min +1) +min;
    }
}
