package com.aaronhowser1.chess.pieces;

import com.aaronhowser1.chess.logic.Move;

import java.util.ArrayList;

public class Knight extends ChessPiece{

    public Knight(int x, int y, boolean isBlack) {
        super("Knight", x, y, isBlack, "Kn");

        ArrayList<Move> moves = new ArrayList<>();

        //Top
        moves.add(new Move(1,2));
        moves.add(new Move(-1,2));
        //Second top
        moves.add(new Move(2,1));
        moves.add(new Move(-2,1));
        //Second bottom
        moves.add(new Move(2,-1));
        moves.add(new Move(-2,-1));
        //Bottom
        moves.add(new Move(1,-2));
        moves.add(new Move(-1,-2));

        super.setMoves(moves);
    }
}
