package database;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class HouseCupTest {

    HouseCup hc = new HouseCup(
            "jdbc:postgresql://localhost:5432/<adatbazisodneve>",
            "<username>", "<password>");

    @Test
    void testGetHouseCupWinner() {
        assertEquals("Gryffindor", hc.getHouseCupWinner());
    }

    @Test
    void testGetValedictorian() {
        assertEquals("Harry Potter", hc.getValedictorian());
    }
}
