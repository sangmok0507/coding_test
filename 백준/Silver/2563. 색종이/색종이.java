import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] rectangle = new int[100][100];

        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            x--; y--;
            for (int j = y; j < y + 10; j++) {
                for (int k = x; k < x + 10; k++) {
                    rectangle[j][k]++;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                if (rectangle[i][j] >= 1) {
                    sum++;
                }
            }
        }
        System.out.println(sum);
    }
}