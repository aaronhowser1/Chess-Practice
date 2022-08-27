package com.aaronhowser1.chess;

import com.aaronhowser1.chess.pieces.*;

public class ChessApplication {

    public static void main(String[] args) {

        int chessBoardWidth = 8;

        for (int i = 0; i < chessBoardWidth; i++) {
            Pawn whitePawn = new Pawn(i, 1,false);
            Pawn blackPawn = new Pawn(i, chessBoardWidth-2, false);
        }

        King king = new King(6,0,false);
        System.out.println(king.getMovesAsString());
    }


}