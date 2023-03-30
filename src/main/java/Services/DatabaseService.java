package Services;

import Models.Admin;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseService {
    public static final String DB_URL = "jdbc:mysql://localhost/universitysystem";
    public static final String USER = "root";
    public static final String PASS = "";

    public DatabaseService() {}
}
