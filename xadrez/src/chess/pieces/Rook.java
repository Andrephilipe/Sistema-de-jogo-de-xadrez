package xadrez.src.chess.pieces;

import xadrez.src.boardgame.Board;
import xadrez.src.chess.ChessPiece;
import xadrez.src.chess.Color;

public class Rook  extends ChessPiece{

    public Rook(Board board, Color color) {
        super(board, color);
    }
    @Override
    public String toString(){
        return "R";
    }
    @Override
    public boolean[][] possibleMoves() {
        // TODO Auto-generated method stub
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColunms()];
        return mat;
    }
    
}
