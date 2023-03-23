package Services;

public class Utility {
    public static boolean numIsInArray(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) return true;
        }

        return false;
    }

    public static void newLine() {
        System.out.println();
    }
}
