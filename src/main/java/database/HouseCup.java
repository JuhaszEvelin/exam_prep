package database;

import java.sql.*;

public class HouseCup {

    private String db_url;
    private String db_name;
    private String db_pass;

    public HouseCup(String url, String name, String pass) {
        this.db_url = url;
        this.db_name = name;
        this.db_pass = pass;
    }

    public String getHouseCupWinner() {
        String query = "SELECT house_name, MAX(points_earned) " +
                "FROM house_points " +
                "GROUP BY house_name " +
                "ORDER BY SUM(points_earned) DESC";

        return getResult(query, "house_name");
    }

    public String getValedictorian() {
        String query = "SELECT student_name, COUNT(points_earned) " +
                "FROM house_points " +
                "GROUP BY student_name " +
                "ORDER BY student_name DESC";

        // SELECT student_name FROM house_points GROUP BY student_name " +
        // "ORDER BY  COUNT(student_name) DESC, student_name ASC LIMIT 1

        return getResult(query, "student_name");

    }

    private String getResult(String query, String column) {
        try (Connection connection = DriverManager.getConnection(db_url, db_name, db_pass)) {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(query);
            if (rs.next()) {
                return (rs.getString(column));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return "";
    }
}
