package com.aaronhowser1.chess.pieces;

import com.aaronhowser1.chess.logic.XY;

import java.util.ArrayList;

public class Knight extends ChessPiece{

    public Knight(int x, int y, boolean isBlack) {
        super("Knight", x, y, isBlack, "Kn");

        ArrayList<XY> moves = new ArrayList<>();

        //Top
        moves.add(new XY(1,2));
        moves.add(new XY(-1,2));
        //Second top
        moves.add(new XY(2,1));
        moves.add(new XY(-2,1));
        //Second bottom
        moves.add(new XY(2,-1));
        moves.add(new XY(-2,-1));
        //Bottom
        moves.add(new XY(1,-2));
        moves.add(new XY(-1,-2));

        super.setMoves(moves);
    }
}
