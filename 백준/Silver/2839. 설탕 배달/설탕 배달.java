import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int min = 5000 / 3;
        int flag = 0;

        for (int i = 0; i <= N / 5; i++) {
            for (int j = 0; j <= (N - 5 * i) / 3; j++) {
                if ((N - 5 * i) % 3 == 0) {
                    flag = 1;
                    int cnt = i + (N - 5 * i) / 3;
                    if (cnt < min) {
                        min = cnt;
                    }
                }
            }
        }
        if (flag == 0) {
            System.out.println(-1);
        } else {
            System.out.println(min);
        }

        scanner.close();
    }
}