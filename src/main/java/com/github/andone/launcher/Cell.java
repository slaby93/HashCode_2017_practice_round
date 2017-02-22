package com.github.andone.launcher;

public class Cell {
    Ingridients i;

    Cell(Ingridients k) {
        this.i = k;
    }

    @Override
    public String toString() {
        return i.toString();
    }
}
