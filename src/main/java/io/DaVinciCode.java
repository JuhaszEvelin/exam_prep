package io;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class DaVinciCode {

    public int decode(String path, char c){
        return (int) inputToStringList(path).stream().filter(c1 -> c1.equals(String.valueOf(c))).count();
    }

    private List<String> inputToStringList(String file) {
        Path path = Path.of(file);
        List<String> chars = new ArrayList<>();
        try (Scanner scanner = new Scanner(path)){
            while (scanner.hasNextLine()) {
                chars.addAll(Arrays.asList(scanner.nextLine().toLowerCase().split("")));
            }
        } catch (IOException e) {
            System.out.println("file not found");
        }
        return chars;
    }


}
