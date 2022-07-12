package xadrez.src.chess;

import xadrez.src.boardgame.Board;
import xadrez.src.boardgame.Position;
import xadrez.src.chess.pieces.King;
import xadrez.src.chess.pieces.Rook;

public class ChessMatch {
    
    private Board board;

    public ChessMatch(){
        board = new Board(8, 8);
        initialSetup();
    }

    public ChessPiece[][] getPieces(){
        ChessPiece[][] mat = new ChessPiece[board.getRows()][board.getColunms()];
        for (int i=0; i<board.getColunms(); i++){
            for(int j=0; j<board.getColunms(); j++){
                mat[i][j] = (ChessPiece) board.piece(i,j);
            }
        }
        return mat;
    }
    private void initialSetup(){
        board.piecePiece(new Rook(board, Color.WHITE), new Position(2, 1));
        board.piecePiece(new King(board, Color.BLACK), new Position(0, 4));
        board.piecePiece(new King(board, Color.WHITE), new Position(7, 4));
    }
}
