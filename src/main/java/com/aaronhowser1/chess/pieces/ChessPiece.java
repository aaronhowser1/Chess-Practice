package com.aaronhowser1.chess.pieces;

import com.aaronhowser1.chess.logic.Move;

import java.util.ArrayList;

public class ChessPiece {

    private String name;
    private ArrayList<Move> moves;
    private int x;
    private int y;
    private boolean isBlack;
    private String symbol;

    public ChessPiece(String name, int x, int y, boolean isBlack, String symbol) {
        this.name = name;
        this.x = x;
        this.y = y;
        this.moves = new ArrayList<>();
        this.isBlack = isBlack;
        this.symbol = symbol;
    }

    public void setMoves(ArrayList<Move> moves) {
        this.moves = moves;
    }

    public ArrayList<Move> getMoves() {
        return this.moves;
    }

    public String getMovesAsString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name+" moves:\n");
        for (Move move : this.moves) {
            int movesForward = move.getY();
            int movesRight = move.getX();
            sb.append("Forward: ("+String.valueOf(movesForward)+"); Right: ("+String.valueOf(movesRight)+")\n");
        }
        return sb.toString();
    }

    public String getName() {
        return this.name;
    }

    public int getX() {
        return x;
    }

    public int getY(){
        return y;
    }

    public String getSymbol() {
        return symbol;
    }

}
