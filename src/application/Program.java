package application;

import java.util.Scanner;

import chess.ChessMath;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				
		Scanner sc = new Scanner(System.in);
		ChessMath chessMath = new ChessMath();
		
		while(true) {
			UI.printBoard(chessMath.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMath.performChessMove(source, target);
		}
		
		
	}

}
