import java.util.Scanner;
import Services.Utility;

public class main {
    public static void main(String[] args) {
        welcomeMessage();

        Scanner input = new Scanner(System.in);
        System.out.print("Unesite opciju: ");
        int option = input.nextInt();

        while (!Utility.numIsInArray(new int[]{1, 2, 3}, option)) {
            System.out.println("Neispravna opcija, pokusajte ponovo!");
            option = input.nextInt();
        }

        while (Utility.numIsInArray(new int[]{1, 2}, option)) {
            boolean loggedIn = false;
            switch (option) {
                case 1:

                case 2:
                    System.out.println("Student");
                case 3:
                    break;
            }
        }

        System.out.println("DOVIDJENJA!");
    }

    public static void welcomeMessage() {
        System.out.println("UNIVERZITET METROPOLITAN");
        System.out.println("Izaberite opciju odabirom broja:");
        System.out.println("1. Admin Login");
        System.out.println("2. Student Login");
        System.out.println("----------------------------------");
        System.out.println("3. Izlaz iz sistema");
        System.out.println("----------------------------------");
    }


}
