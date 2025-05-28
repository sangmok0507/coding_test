import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[99][99];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }

        int max = arr[0][0];
        int maxi = 0;
        int maxj = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    maxi = i;
                    maxj = j;
                }
            }
        }
        maxi++;
        maxj++;
        System.out.println(max);
        System.out.println(maxi + " " + maxj);
    }
}