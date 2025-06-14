import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int[] deck = new int[N];
        for (int i = 0; i < N; i++) {
            deck[i] = scanner.nextInt();
        }

        int max = 0;
        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                for (int k = j + 1; k < N; k++) {
                    int sum = deck[i] + deck[j] + deck[k];
                    if (sum == M) {
                        System.out.println(sum);
                        return;
                    }
                    if (sum < M && max < sum) {
                        max = sum;
                    }
                }
            }
        }
        System.out.println(max);

    }
}