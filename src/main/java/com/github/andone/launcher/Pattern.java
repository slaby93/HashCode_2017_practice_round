package com.github.andone.launcher;

import java.util.Collections;
import java.util.List;

/**
 * Created by denis on 2/22/17.
 */
public class Pattern {
    private final int x;
    private final int y;

    public static List<Pattern> getPatterns() {
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
