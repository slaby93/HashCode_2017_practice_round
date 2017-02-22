package com.github.andone.launcher;

import org.apache.commons.io.IOUtils;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

/**
 * Created by denis on 2/22/17.
 */
public class Main {
    private static final String IN_FILE_NAME = "in/small.in";

    public static void main(String[] args) throws IOException {
        InputStream inStream = Main.class.getClassLoader().getResourceAsStream(IN_FILE_NAME);
        BufferedInputStream bis = new BufferedInputStream(inStream);

        String input = IOUtils.toString(bis, StandardCharsets.UTF_8);
        System.out.println();
        System.out.println(input);
    }

}
