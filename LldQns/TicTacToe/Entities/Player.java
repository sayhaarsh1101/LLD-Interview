package LldQns.TicTacToe.Entities;

public class Player {
    private String name;
    private PieceType pieceType;

    Player(String name, PieceType pieceType){
        this.name = name;
        this.pieceType = pieceType;
    }

    public String getName(){
        return name;
    }

    public PieceType getPieceType(){
        return pieceType;
    }
    
}
