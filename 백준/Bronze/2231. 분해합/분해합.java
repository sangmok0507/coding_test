import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for (int i = 1; i < N; i++) {
            int M = i;
            int sum = 0;
            while (M > 0) {
                sum += M % 10;
                M /= 10;
            }
            sum += i;
            if (sum == N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }

}