package database;

public class HouseCup {

    private String db_url;
    private String db_name;
    private String db_pass;

    public HouseCup(String url, String name, String pass) {
        this.db_url = url;
        this.db_name = name;
        this.db_pass = pass;
    }
}
