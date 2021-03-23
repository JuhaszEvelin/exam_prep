package algorythm;

import java.util.Arrays;
import java.util.stream.Collectors;

public class UniqueFinder {

    public char[] uniqueChars(String s) {
        if (s == null) throw new IllegalArgumentException();
        return Arrays.stream(s.split("")).distinct().collect(Collectors.joining()).toCharArray();
    }
}
