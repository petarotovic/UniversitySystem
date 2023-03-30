package Controllers;
import java.sql.*;
import java.util.Objects;
import java.util.Scanner;
import Models.Admin;
import Services.Utility;
import Services.DatabaseService;

import javax.xml.crypto.Data;

public class AdminController {
    public static int adminInit() {
        String email = "";
        String password = "";
        Scanner input = new Scanner(System.in);
        int option = 0;
        Admin admin;
        System.out.println("PONOVO");
        while (option < 2 && option >= 0) {
            if (option == 0) {
                System.out.print("Unesite email: ");
                email = input.next();

                System.out.print("Unesite password: ");
                password = input.next();

                admin = adminLogin(email, password);

                if(isValidAdmin(admin)) {
                    System.out.println("VALID");
                    option = 1;
                    continue;
                }

                Utility.showError("Nesipravan mejl ili lozinka!");
                System.out.print("Da li zelite da pokusate ponovo? (1 - da, 2 - ne) ");
                int next = input.nextInt();
                System.out.println(next);
                if (next == 1) {
                    option = 1;
                    continue;
                } else {
                    option = -1;
                    continue;
                }
            }

            if (option == 1) {
                System.out.println("IDEMO");
                int y = input.nextInt();
                continue;
            }
        }

        return 0;
    }
    private static Admin adminLogin(String email, String password) {
        DatabaseService s = new DatabaseService();
        final String QUERY = "SELECT * FROM admin WHERE email = '" + email + "' AND password = '" + password + "'";

        try (Connection conn = DriverManager.getConnection(DatabaseService.DB_URL, DatabaseService.USER, DatabaseService.PASS);
             Statement stmt = conn.createStatement();
             ResultSet result = stmt.executeQuery(QUERY);)
        {
            if (!result.next()) {
                return new Admin();
            }

            return new Admin(result.getString("name"), result.getString("email"));
        }catch (SQLException e) {
            System.out.println(e);
            return new Admin();
        }
    }

    private static boolean isValidAdmin(Admin admin) {
        return !Objects.equals(admin.name, "") && !Objects.equals(admin.email, "");
    }
}
