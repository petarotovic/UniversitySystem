package Services;

import Models.Admin;

import java.sql.SQLException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseService {
    static final String DB_URL = "jdbc:mysql://localhost/universitysystem";
    static final String USER = "root";
    static final String PASS = "";

    public static Admin login(String email, String password, String table) {
        final String QUERY = "SELECT * FROM " + table + " WHERE email = ''" + email + "' AND password = '" + password + "'";
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(QUERY);)
        {
            while (rs.next()) {
                System.out.println(rs.getInt("id"));
            }

            return new Admin();
        }catch (SQLException e) {
            return new Admin();
        }
    }

}
