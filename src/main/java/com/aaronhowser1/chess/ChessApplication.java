package com.aaronhowser1.chess;


public class ChessApplication {

    public static void main(String[] args) {

        ChessBoard chessBoard = new ChessBoard();

        chessBoard.initialize();
        chessBoard.viewBoard();

    }


}