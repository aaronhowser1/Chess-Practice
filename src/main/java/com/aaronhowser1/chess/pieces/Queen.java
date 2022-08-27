package com.aaronhowser1.chess.pieces;

import com.aaronhowser1.chess.logic.XY;

import java.util.ArrayList;

public class Queen extends ChessPiece {
    public Queen(boolean isBlack) {
        super("Queen", isBlack, "🚺");

        ArrayList<XY> moves = new ArrayList<>();

        super.setMoves(moves);
    }
}
