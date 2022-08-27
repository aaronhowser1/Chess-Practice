package com.aaronhowser1.chess.pieces;

import com.aaronhowser1.chess.logic.Move;

import java.util.ArrayList;

public class King extends ChessPiece {
    public King(int x, int y, boolean isBlack) {
        super("King",x,y,isBlack,"K");

        ArrayList<Move> moves = new ArrayList<>();
        for (int forward = -1; forward <= 1; forward++) {
            for (int right = -1; right <= 1; right++) {
                if (!(forward == right && forward == 0)) {
                    moves.add(new Move(right, forward));
                }
            }
        }
        super.setMoves(moves);
    }
}
