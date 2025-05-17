import java.math.BigDecimal;
import java.util.Scanner;

import static java.lang.Math.round;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        double total = 0.0;
        for (int i = 0; i < 20; i++) {
            String major = scanner.nextLine();
            double score = Double.parseDouble(major.split(" ")[1]);
            String grade = major.split(" ")[2];

            if (grade.equals("A+")) {
                sum += 4.5 * score;
            } else if (grade.equals("A0")) {
                sum += 4.0 * score;
            } else if (grade.equals("B+")) {
                sum += 3.5 * score;
            } else if (grade.equals("B0")) {
                sum += 3.0 * score;
            } else if (grade.equals("C+")) {
                sum += 2.5 * score;
            } else if (grade.equals("C0")) {
                sum += 2.0 * score;
            } else if (grade.equals("D+")) {
                sum += 1.5 * score;
            } else if (grade.equals("D0")) {
                sum += score;
            }

            if (!grade.equals("P")) {
                total += score;
            }
        }
        System.out.println(String.format("%.6f", sum / total));
    }
}