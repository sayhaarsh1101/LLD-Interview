package LldQns.TicTacToe.Entities;

import java.util.Deque;
import java.util.Scanner;

public class GameController {

    private Board board;
    private Deque<Player> players;
    private WinningStrategy winningStrategy;
    private GameStatus gameStatus;

    GameController(int size, Deque<Player> players){
        this.board = new Board(size);
        this.players = players;
        this.winningStrategy = new CounterWinningStrategy(size);
        this.gameStatus = GameStatus.IN_PROGRESS;
    }

    public void playGame(){
        //run while loop until game is in progress
        // game will run out of progress when board is fill (eithr dra or win)
        // run inside a while loop till player makes the valid move
        //after every valid move will check the if player win or not
        Scanner scanner = new Scanner(System.in);

        while(gameStatus == GameStatus.IN_PROGRESS){
            Player currPlayer = players.pollFirst();

            boolean validMove = false;
            Move move = null;

            while(!validMove){
                board.printBoard();

                System.out.println("For Player : " + currPlayer.getName()  + "and PieceType :" 
                + currPlayer.getPieceType() + "Enter the row and column ");

                int row = scanner.nextInt();
                int col = scanner.nextInt();
                move = new Move(row, col);

                if(board.placeMove(move, currPlayer)){
                    validMove = true;
                }
            }

            if(winningStrategy.checkWinner(move, currPlayer)){
                board.printBoard();
                System.out.println(currPlayer.getName() + "Wins");
                gameStatus = GameStatus.WIN;
                return;
            }

            if(board.isFull()){
                board.printBoard();
                System.out.println("Match Draw");
                gameStatus = GameStatus.DRAW;
                return;
            }
            players.offerLast(currPlayer);
        }
    }

}
