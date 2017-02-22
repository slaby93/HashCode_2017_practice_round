package com.github.andone.launcher;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by denis on 2/22/17.
 */
public class Pattern {
    private final int x;
    private final int y;

    public static List<Pattern> getPatterns() {
        return Arrays.asList(
                new Pattern(5 ,0),
                new Pattern(0 ,5),
                new Pattern(0 ,4),
                new Pattern(4 ,0),
                new Pattern(2 ,2),
                new Pattern(0 ,3),
                new Pattern(3 ,0),
                new Pattern(2 ,0),
                new Pattern(0 ,2)
        );
    }

    public static List<List<Cell>> getValidRegions() {
        return Collections.emptyList();
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
