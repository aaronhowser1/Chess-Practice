package com.aaronhowser1.chess.logic;

public record XY(int x, int y) {
    public XY add(int ax, int ay) {
        return new XY(x() + ax, y() + ay);
    }

    public XY add(XY other) {
        return add(other.x(), other.y());
    }
}
