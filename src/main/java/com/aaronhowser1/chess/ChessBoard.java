package com.aaronhowser1.chess;

import com.aaronhowser1.chess.logic.XY;
import com.aaronhowser1.chess.pieces.ChessPiece;

import java.util.HashMap;

public class ChessBoard {
    private final int size;

    private HashMap<XY, ChessPiece> placedPieces;

    public ChessBoard(int size) {
        this.size = size;
    }

    public boolean setPiece(ChessPiece piece, int x, int y) {
        if (x > size || y > size) {
            return false;
        } else if (getPiece(x,y) != null) {
            return false;
        }
        return false;
    }

    public ChessPiece getPiece(int x, int y) {
        XY pos = new XY(x,y);
        return placedPieces.get(pos);
    }
}
