import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int k = 2; k * k <= n; k++) {
            while (n % k == 0) {
                System.out.println(k);
                n /= k;
            }
        }

        if (n > 1) {
            System.out.println(n);
        }

        scanner.close();
    }

}