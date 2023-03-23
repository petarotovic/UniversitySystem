package Controllers;
import java.util.Scanner;
import Models.Admin;
import Services.Utility;
import Services.DatabaseService;

public class AdminController {
    public static void adminInit() {
        String email = "";
        String password = "";
        Scanner input = new Scanner(System.in);

        System.out.print("Unesite email: ");
        email = input.next();
        Utility.newLine();

        System.out.println("Unesite password: ");
        password = input.next();

        while (DatabaseService) {

        }
    }
    public static boolean adminLogin() {

    }
}
