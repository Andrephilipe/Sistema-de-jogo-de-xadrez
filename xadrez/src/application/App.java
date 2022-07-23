package xadrez.src.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import xadrez.src.chess.ChessException;
import xadrez.src.chess.ChessMatch;
import xadrez.src.chess.ChessPiece;
import xadrez.src.chess.ChessPosition;

public class App {
    public static void main(String[] args) throws Exception {
       
        ChessMatch chessMatch = new ChessMatch();
        Scanner sc = new Scanner(System.in);

        while(true) {
            try{
                UI.clearScreen();
                UI.printBoard(chessMatch.getPieces());
                System.out.println();
                System.out.print("source: ");
                ChessPosition source = UI.readChessPosition(sc);
    
                System.out.println();
                System.out.print("Target: ");
                ChessPosition target = UI.readChessPosition(sc);
    
                ChessPiece capturedPiece = chessMatch.performChessMove(source, target);
            }
            catch(ChessException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
            catch(InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}


