import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        double a = 2.0;
        double b = 1.0;
        double sum = 0.0;

        for (int i = 0; i < N; i++, b *= 2) {
            sum = Math.pow(a + b, 2);
            a = a + b;
        }
        System.out.println((int) sum);
    }
}