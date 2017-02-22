package com.github.andone.launcher;

/**
 * Created by Slaby on 22.02.2017.
 */
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
