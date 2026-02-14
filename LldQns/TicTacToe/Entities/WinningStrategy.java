package LldQns.TicTacToe.Entities;

interface WinningStrategy {
    boolean checkWinner(Move move, Player player);
}
