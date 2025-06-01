import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int m = scanner.nextInt();
        int n = scanner.nextInt();

        int sum = 0;
        int min = 10001;

        for (int i = m; i <= n; i++) {
            int cnt = 1;
            if (i == 1) {
                continue;
            }
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                }
            }
            if (cnt == 1) {
                sum += i;
                if (min > i) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sum);
        System.out.println(min);
    }
}