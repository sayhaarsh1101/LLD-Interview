package LldQns.TicTacToe.Entities;

public class Board {
    private int size;
    private PieceType[][] grid;
    private int movesCount;

    Board(int size){
        this.size = size;
        this.grid = new PieceType[size][size];
        this.movesCount =0;
    }

    public boolean placeMove(Move move, Player player){
        int row = move.getRow();
        int col = move.getCol();

        if(row >= size || row < 0 || col <0 || col >=size){
            return false;
        }

        if(grid[row][col] != null){
            return false;
        }
        grid[row][col] = player.getPieceType();
        movesCount++;
        return true;
    }

    public boolean isFull(){
        return (movesCount == size *size);
    }

    public int getSize(){return size;}

    public PieceType[][] getGrid(){
        return grid;
    }

    public boolean checkAlreadyFilled(){

    }

    public void printBoard(){
        for(int i =0;i<size;i++){
            for(int j=0;j<size;j++){
                if(grid[i][j] == null){
                    System.out.print(" - ");
                } else {
                    System.out.print(" " + grid[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
