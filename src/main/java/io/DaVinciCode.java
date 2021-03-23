package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;

public class DaVinciCode {


    public int decode(String path, char c) {

        String readLines = "";

        File file = new File(path);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null) {
                readLines += currentLine;
            }
        } catch (IOException e) {
        }

        int counter = 0;

        for (int i = 0; i < readLines.length(); i++) {

            if (readLines.toLowerCase().charAt(i) == c) {
                counter++;
            }
        }
        return counter;

    }

}
