package xadrez.src.chess;

import xadrez.src.boardgame.Board;
import xadrez.src.boardgame.Piece;
import xadrez.src.boardgame.Position;

public abstract class ChessPiece extends Piece{

    private Color color;
 
    public Color getColor() {
        return color;
    }

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece)getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
    
}
