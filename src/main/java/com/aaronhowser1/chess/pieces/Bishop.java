package com.aaronhowser1.chess.pieces;

import com.aaronhowser1.chess.logic.XY;

import java.util.ArrayList;

public class Bishop extends ChessPiece {
    public Bishop(boolean isBlack) {
        super("Bishop", isBlack, "✝");

        ArrayList<XY> moves = new ArrayList<>();

        super.setMoves(moves);
    }
}

