package artifex;

import java.sql.ResultSet;
import java.sql.Statement;


public class Service {

    private final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    private final String DB_URL = "jdbc:mysql://localhost/test";
    private final String USER = "root";
    private final String PASS = "";



    public Statement getStatement() {
        return statement;
    }

    private Statement statement;

    public ResultSet getRs() {
        return rs;
    }

    private ResultSet rs;


    public String getJDBC_DRIVER() {
        return JDBC_DRIVER;
    }

    public String getDB_URL() {
        return DB_URL;
    }

    public String getUSER() {
        return USER;
    }

    public String getPASS() {
        return PASS;
    }
}
