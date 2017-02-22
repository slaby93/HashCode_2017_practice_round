package com.github.andone.launcher;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Slaby on 22.02.2017.
 */
public class Region {
    List<List<Cell>> region;
    public final int regionId = -1;

    Region(){
        region = new ArrayList<>();
    }

    Region(List<List<Cell>> i){
        this.region = i;
    }
}
