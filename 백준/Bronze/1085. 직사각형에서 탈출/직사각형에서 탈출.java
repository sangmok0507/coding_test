import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int w = scanner.nextInt();
        int h = scanner.nextInt();

        int min = 0;
        double m1 = w / 2.0;
        double m2 = h / 2.0;

        if (x < m1) {
            if (y < m2) {
                min = x < y ? x : y;
            } else {
                min = x < h - y ? x : h - y;
            }
        } else {
            if (y < m2) {
                min = w - x < y ? w - x : y;
            } else {
                min = w - x < h - y ? w - x : h - y;
            }
        }
        System.out.println(min);
    }
}