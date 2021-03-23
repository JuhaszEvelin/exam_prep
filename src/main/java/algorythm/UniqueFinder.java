package algorythm;

import java.util.List;

public class UniqueFinder {

    public char[] uniqueChars(String s) {
        if (s == null) {
            throw new IllegalArgumentException();
        }
        String result = "";

        String[] chars = s.replaceAll("[^a-zA-Z]", "").split("");

        for (String c : chars) {
            if (!result.contains(c)) {
                result += c;
            }
        }
        return result.toCharArray();
    }

}
