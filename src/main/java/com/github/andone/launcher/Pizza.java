package com.github.andone.launcher;


import java.util.ArrayList;
import java.util.List;

public class Pizza {
    List<List<Cell>> pizza;

    Pizza(int x, int y) {
        pizza = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            pizza.add(new ArrayList<>());
            for (int j = 0; j < y; j++) {
                pizza.get(i).add(new Cell(i,j,Ingridients.EMPTY));
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        pizza.forEach(item -> sb.append(item.toString() + "\n"));
        return sb.toString();
    }

    public void set(int i, int j, Cell c) {
        pizza.get(i).set(j, c);
    }

    public Cell get(int i, int j) {
        return pizza.get(i).get(j);
    }

}
