package xadrez.src.chess;

import xadrez.src.boardgame.Board;
import xadrez.src.boardgame.Piece;

public class ChessPiece extends Piece{

    private Color color;

    public Color getColor() {
        return color;
    }

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }
    
}
