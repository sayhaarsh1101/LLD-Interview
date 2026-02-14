package LldQns.TicTacToe.Entities;

public class CounterWinningStrategy implements WinningStrategy{

    private int size;
    private int rows[];
    private int cols[];
    private int diagonal;
    private int antiDiagonal;


    public CounterWinningStrategy(int size){
        this.size = size;
        this.rows = new int[size];
        this.cols = new int[size];
        this.diagonal =0;
        this.antiDiagonal =0;
    }

    @Override
    public boolean checkWinner(Move move, Player player) {
        
        int row = move.getRow();
        int col = move.getCol();

        int value = player.getPieceType() == PieceType.X ? 1 : -1;

        rows[row] += value;
        cols[col] += value;

        if(row == col){
            diagonal += value;
        }

        if(row + col == size -1){
            antiDiagonal += value;
        }

        return Math.abs(rows[row]) == size ||
        Math.abs(cols[col]) == size ||
        Math.abs(diagonal) == size ||
        Math.abs(antiDiagonal) == size;
    }
    
}
