package com.aaronhowser1.chess.pieces;


import com.aaronhowser1.chess.logic.XY;

import java.util.ArrayList;

public class Pawn extends ChessPiece{
    public Pawn(boolean isBlack) {
        super("Pawn", isBlack,"👶");

        ArrayList<XY> moves = new ArrayList<>();

        moves.add(new XY(0, 1));
        moves.add(new XY(0, 2));

        super.setMoves(moves);
    }
}
