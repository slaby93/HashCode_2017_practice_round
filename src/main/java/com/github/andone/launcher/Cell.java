package com.github.andone.launcher;

public class Cell {
    Ingridients i;
    int x;
    int y;

    Cell(int x, int y, Ingridients k) {
        this.x = x;
        this.y = y;
        this.i = k;
    }

    @Override
    public String toString() {
        return i.toString() + "(" + x + "," + y + ")";
    }
}
