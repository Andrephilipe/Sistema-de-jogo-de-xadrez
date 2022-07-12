package xadrez.src.chess.pieces;

import xadrez.src.boardgame.Board;
import xadrez.src.chess.ChessPiece;
import xadrez.src.chess.Color;

public class King  extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString(){
        return "K";
    }
    
}
