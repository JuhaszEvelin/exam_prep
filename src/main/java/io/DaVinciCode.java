package io;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DaVinciCode {

    public int decode(String path, char c){
        return (int) inputToCharList(path).stream().filter(c1 -> c1 == c).count();
    }

    private List<Character> inputToCharList(String file) {
        Path path = Path.of(file);
        List<Character> chars = new ArrayList<>();
        char [] lineToChar;
        try (Scanner scanner = new Scanner(path)){
            while (scanner.hasNextLine()) {
                lineToChar = scanner.nextLine().toLowerCase().toCharArray();
                for (Character c : lineToChar) {
                    chars.add(c);
                }
            }
        } catch (IOException e) {
            System.out.println("file not found");
        }
        return chars;
    }


}
