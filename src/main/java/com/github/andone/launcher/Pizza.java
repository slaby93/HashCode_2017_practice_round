package com.github.andone.launcher;


import java.util.ArrayList;
import java.util.List;

public class Pizza {
    List<List<Cell>> pizza;
    int nextRegion = -1;

    int width;
    int height;

    Pizza(int x, int y) {
        width = x;
        height = y;
        pizza = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            pizza.add(new ArrayList<>());
            for (int j = 0; j < y; j++) {
                pizza.get(i).add(new Cell(i, j, Ingridients.EMPTY));

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

    public int getWidth(){return width;}

    public int getHeight(){return height;}

    public void compute() {
        Cell c = this.getNextEmptyCell();
//        // list of regions
        List<List<Cell>> region = Pattern.getValidRegions(c.x, c.y, this);
        List<Cell> notImpactingRegion = getBiggestNotImpactingRegion(region);
        int reg = this.nextRegion();
        for (int i = 0; i < notImpactingRegion.size(); i++) {
            notImpactingRegion.get(i).regionId = reg;
        }
    }

    public List<Cell> getBiggestNotImpactingRegion(List<List<Cell>> arg) {
        List<Cell> result = new ArrayList<>();
        for (int i = 0; i < arg.size(); i++) {
            if (arg.get(i).size() > arg.get(i).size()) {
                result = arg.get(i);
            }
        }
        return result;
    }

    public Cell getNextEmptyCell() {
        Cell result = null;
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                if (pizza.get(i).get(i).regionId == -1) {
                    return pizza.get(i).get(j);
                }
            }
        }
        return result;
    }

    public int nextRegion() {
        return nextRegion++;
    }



    public List<List<Integer>> patternCount(){
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < this.getWidth(); i++) {
            result.add(new ArrayList<>());
            for (int j = 0; j < this.getHeight(); j++) {
                result.get(i).add(0);

            }
        }

        return result;
    }

}
