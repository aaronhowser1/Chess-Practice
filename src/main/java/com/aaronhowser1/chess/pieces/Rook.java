package com.aaronhowser1.chess.pieces;

import com.aaronhowser1.chess.logic.XY;

import java.util.ArrayList;

public class Rook extends ChessPiece {
    public Rook(boolean isBlack) {
        super("Rook", isBlack, "🏰");

        ArrayList<XY> moves = new ArrayList<>();

        super.setMoves(moves);
    }
}
