
package database;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class HouseCupTest {

    private static final String HP = "Harry Potter";
    private static final String DRACO = "Draco Malfoy";
    private static final String CEDRIC = "Cedric Diggory";
    private static final String GRYFFINDOR = "Gryffindor";
    private static final String SLYTHERIN = "Slytherin";
    private static final String HUFFLE = "Hufflepuff";

    private static final String DB_URL = "jdbc:h2:mem:test;DB_CLOSE_DELAY=-1";
    private static final String DB_USER = "sa";
    private static final String DB_PASSWORD = "";

    HouseCup hc = new HouseCup(DB_URL, DB_USER, DB_PASSWORD);

    @BeforeEach
    void init() {
        hc = new HouseCup(DB_URL, DB_USER, DB_PASSWORD);
        initTables();
        createDummyData();
    }

    @Test
    void testGetHouseCupWinner() {
        assertEquals("Gryffindor", hc.getHouseCupWinner());
    }

    @Test
    void testGetValedictorian() {
        assertEquals("Harry Potter", hc.getValedictorian());
    }

    private void initTables() {

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "CREATE TABLE IF NOT EXISTS house_points (" +
                    "house_name VARCHAR(255), " +
                    "student_name VARCHAR(255), " +
                    "points_earned INT" +
                    ");";
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    void createDummyData() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "INSERT INTO house_points VALUES ('" + GRYFFINDOR + "', '" + HP + "', 50)";
            Statement statement = connection.createStatement();
            statement.execute(query);
            query = "INSERT INTO house_points VALUES ('" + SLYTHERIN + "', '" + DRACO + "', 10)";
            statement = connection.createStatement();
            statement.execute(query);
            query = "INSERT INTO house_points VALUES ('" + SLYTHERIN + "', '" + DRACO + "', 20)";
            statement = connection.createStatement();
            statement.execute(query);
            query = "INSERT INTO house_points VALUES ('" + GRYFFINDOR + "', '" + HP + "', -15)";
            statement = connection.createStatement();
            statement.execute(query);
            query = "INSERT INTO house_points VALUES ('" + HUFFLE + "', '" + CEDRIC + "', 25)";
            statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @AfterEach
    void destruct() {
        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String query = "DROP TABLE IF EXISTS house_points";
            Statement statement = connection.createStatement();
            statement.execute(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

