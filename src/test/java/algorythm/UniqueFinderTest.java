package algorythm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class UniqueFinderTest {
    UniqueFinder uf = new UniqueFinder();


    @Test
    void testUniqueChars_justCharacters(){
        String test = "szerepjatek";
        char [] result = {'s', 'z', 'e', 'r', 'p', 'j', 'a', 't', 'k'};
        char [] input = uf.uniqueChars(test);
        assertEquals(result, input);
    }

    @Test
    void testUniqueChars_charactersWithVariousWhitespaces(){
        String test = "  szer@epja!te  k";
        char [] result = {'s', 'z', 'e', 'r', 'p', 'j', 'a', 't', 'k'};
        char [] input = uf.uniqueChars(test);
        assertEquals(result, input);
    }

    @Test
    void testUniqueChars_inputIsNull(){
        String test = null;
        assertThrows(IllegalArgumentException.class, () -> uf.uniqueChars(test));
    }


}
