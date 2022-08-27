package com.aaronhowser1.chess;

import com.aaronhowser1.chess.logic.XY;
import com.aaronhowser1.chess.pieces.*;

import java.util.HashMap;

public class ChessBoard {

    private HashMap<XY, ChessPiece> placedPieces;
    //Remember, XY is (0,0) - (7,7) which makes an 8x8 board

    public ChessBoard() {
        this.placedPieces = new HashMap<>();
    }

    public boolean setPiece(ChessPiece piece, int x, int y) {
        if (x > 7 || y > 7) {
            return false;
        } else if (getPiece(x,y) != null) {
            return false;
        } else {
            placedPieces.put(new XY(x,y),piece);
            return true;
        }
    }

    public ChessPiece getPiece(int x, int y) {
        XY pos = new XY(x,y);
        return placedPieces.get(pos);
    }

    public void initialize() {
        if (!placedPieces.isEmpty()) {
            placedPieces.clear();
        }

        //Place Pawns
        for (int x = 0; x <= 8; x++) {
            setPiece(new Pawn(false),x,1);
            setPiece(new Pawn(true),x,6);
        }

        //Place Kings
        setPiece(new King(false),4,0);
        setPiece(new King(true),4,7);

        //Place Queens
        setPiece(new Queen(false),3,0);
        setPiece(new Queen(true),3,7);

        //Place Knights
        setPiece(new Knight(false), 1, 0);
        setPiece(new Knight(false),6, 0);
        setPiece(new Knight(true), 1, 7);
        setPiece(new Knight(true),6, 7);

        //Place Rooks
        setPiece(new Rook(false),0,0);
        setPiece(new Rook(false),7,0);
        setPiece(new Rook(true),0,7);
        setPiece(new Rook(true),7,7);

        //Place Bishops
        setPiece(new Bishop(false),2,0);
        setPiece(new Bishop(false),5,0);
        setPiece(new Bishop(true),2,7);
        setPiece(new Bishop(true),5,7);

    }

    public void viewBoard() {
        StringBuilder sb = new StringBuilder();
        for (int y = 7; y >= 0; y--) {
            for (int x = 0; x < 8; x++) {
                String symbol = "🔳";
                if (getPiece(x,y) != null) {
                    symbol = getPiece(x,y).getSymbol();
                }
                sb.append(symbol);
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
