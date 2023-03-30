package Services;

public class Utility {
    public static boolean numIsInArray(int[] arr, int number) {
        for (int j : arr) {
            if (j == number) return true;
        }

        return false;
    }

    public static void newLine() {
        System.out.println();
    }

    public static void showError(String error) {
        System.out.println("____________________________________________________");
        System.out.println(error);
        System.out.println("----------------------------------------------------");
    }
}
