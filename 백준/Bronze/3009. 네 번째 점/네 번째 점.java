import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] x = new int[3];
        int[] y = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }

        int xFind = notDuplicate(x);
        int yFind = notDuplicate(y);
        System.out.println(xFind + " " + yFind);
    }

    public static int notDuplicate(int[] arr) {
        for (int i = 0; i < 3; i++) {
            int cnt = 0;
            for (int j = 0; j < 3; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                return arr[i];
            }
        }
        return 0;
    }
}