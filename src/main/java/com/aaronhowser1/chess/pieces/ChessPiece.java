package com.aaronhowser1.chess.pieces;

import com.aaronhowser1.chess.logic.XY;

import java.util.ArrayList;

public class ChessPiece {

    private String name;
    private ArrayList<XY> moves;
    private boolean isBlack;
    private String symbol;

    public ChessPiece(String name, boolean isBlack, String symbol) {
        this.name = name;
        this.moves = new ArrayList<>();
        this.isBlack = isBlack;
        this.symbol = symbol;
    }

    public void setMoves(ArrayList<XY> moves) {
        this.moves = moves;
    }

    public ArrayList<XY> getMoves() {
        return this.moves;
    }

    public String getMovesAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name+" moves:\n");
        for (XY move : this.moves) {
            int movesForward = move.y();
            int movesRight = move.x();
            sb.append("Forward: ("+String.valueOf(movesForward)+"); Right: ("+String.valueOf(movesRight)+")\n");
        }
        return sb.toString();
    }

    public String getName() {
        return this.name;
    }


    public String getSymbol() {
        return symbol;
    }

}
