package com.github.andone.launcher;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by denis on 2/22/17.
 */
public class Pattern {
    private final int x;
    private final int y;

    public static List<Pattern> getPatterns() {
        return Arrays.asList(
                new Pattern(4, 0),
                new Pattern(0, 4),
                new Pattern(0, 3),
                new Pattern(3, 0),
                new Pattern(1, 1),
                new Pattern(0, 2),
                new Pattern(2, 0),
                new Pattern(1, 0),
                new Pattern(0, 1)
        );
    }

    public static List<List<Cell>> getValidRegions(int x, int y, Pizza pizza) {
        List<List<Cell>> regions = new ArrayList<>();
        for (Pattern pattern : getPatterns()) {
            int dx = pattern.x;
            int dy = pattern.y;

            for (int i = -1; i <= 1; i += 2) {
                for (int j = -1; j <= 1; j += 2) {
                    int x2 = x + dx * i;
                    int y2 = y + dy * j;
                    if (isValidRegion(x + x2, y + y2, pizza)) {
                        regions.add(cellsInRegion(x, y, x2, y2, pizza));
                    }
                }
            }
        }
        return regions;
    }

    private static boolean isValidRegion(int x, int y, Pizza pizza) {
        return x < pizza.height && y < pizza.width && x >= 0 && y >= 0;
    }

    private static List<Cell> cellsInRegion(int x0, int y0, int dx, int dy, Pizza pizza) {
        List<Cell> region = new ArrayList<>();
        for (int i = x0; i <= dx; i++) {
            for (int j = y0; j <= dy; j++) {
                region.add(pizza.get(i, j));
            }
        }
        return region;
    }

    public Pattern(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
