import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] arr = new String[5][15];

        for (int i = 0; i < 5; i++) {
            String s = scanner.nextLine();
            for (int j = 0; j < s.length(); j++) {
                arr[i][j] = s.split("")[j];
            }
        }

        for (int i = 0; i < 15; i++) {
            for (int j = 0; j < 5; j++) {
                if (arr[j][i] != null) {
                    System.out.print(arr[j][i]);
                }
            }
        }


    }
}