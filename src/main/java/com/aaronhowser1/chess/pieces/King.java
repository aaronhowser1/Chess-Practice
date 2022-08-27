package com.aaronhowser1.chess.pieces;

import com.aaronhowser1.chess.logic.XY;

import java.util.ArrayList;

public class King extends ChessPiece {
    public King(boolean isBlack) {
        super("King", isBlack,"🚹");

        ArrayList<XY> moves = new ArrayList<>();
        for (int forward = -1; forward <= 1; forward++) {
            for (int right = -1; right <= 1; right++) {
                if (!(forward == right && forward == 0)) {
                    moves.add(new XY(right, forward));
                }
            }
        }
        super.setMoves(moves);
    }
}
