package com.github.andone.launcher;

import jdk.nashorn.internal.runtime.regexp.joni.Regex;
import org.apache.commons.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

/**
 * Created by denis on 2/22/17.
 */
public class Main {
    private static final String IN_FILE_NAME = "in/small.in";

    public static void main(String[] args) throws IOException {
        Scanner s = new Scanner(Main.class.getClassLoader().getResourceAsStream(IN_FILE_NAME));
//        BufferedInputStream bis = new BufferedInputStream(inStream);

//        String input = IOUtils.toString(bis, StandardCharsets.UTF_8);

        int width = s.nextInt();
        int height = s.nextInt();
        int minIng = s.nextInt();
        int maxIng = s.nextInt();

        Pizza p = new Pizza(width, height);
        s.nextLine();
        for (int i = 0; i < width; i++) {
            String in = s.nextLine();

            for (int j = 0; j < height; j++) {
                if (in.charAt(j) == 'T') {
                    p.set(i, j, new Cell(Ingridients.TOMATO));
                } else {
                    p.set(i, j, new Cell(Ingridients.MUSHROM));
                }
            }
        }
        System.out.println(p);
//        System.out.println();
//        System.out.println(input);
    }


    

}
