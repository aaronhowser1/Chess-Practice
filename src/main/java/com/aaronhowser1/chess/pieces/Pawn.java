package com.aaronhowser1.chess.pieces;


import com.aaronhowser1.chess.logic.Move;

import java.util.ArrayList;

public class Pawn extends ChessPiece{
    public Pawn(int x, int y, boolean isBlack) {
        super("Pawn", x, y,isBlack,"P");
        ArrayList<Move> moves = new ArrayList<>();
        moves.add(new Move(0, 1));
        moves.add(new Move(0, 2));
        super.setMoves(moves);
    }
}
