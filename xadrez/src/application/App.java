package xadrez.src.application;

import xadrez.src.chess.ChessMatch;

public class App {
    public static void main(String[] args) throws Exception {
       
        ChessMatch chessMatch = new ChessMatch();
        UI.printBoard(chessMatch.getPieces());
    }
}


