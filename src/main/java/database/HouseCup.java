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

    public String getHouseCupWinner(){
        String SQL = "SELECT house_name, SUM(points_earned) AS points " +
                "FROM house_points " +
                "GROUP BY house_name " +
                "ORDER BY points DESC " +
                "LIMIT 1";
        try (Connection connection = getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            System.out.println(rs.getString(1));
            return rs.getString(1);

        } catch (SQLException e) {
            throw new RuntimeException("Error reading houses");
        }

    }

    public String getValedictorian(){
        String SQL = "SELECT student_name, SUM(points_earned) AS points " +
                "FROM house_points " +
                "GROUP BY student_name " +
                "ORDER BY points DESC " +
                "LIMIT 1";
        try (Connection connection = getConnection()){
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(SQL);
            return rs.getString(1);

        } catch (SQLException e) {
            throw new RuntimeException("Error reading houses");
        }
    }

    private Connection getConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(db_url, db_name, db_pass);
            System.out.println("Connection OK");
        } catch (SQLException e) {
            System.out.println("Connection failed");
        }
        return connection;
    }
}
