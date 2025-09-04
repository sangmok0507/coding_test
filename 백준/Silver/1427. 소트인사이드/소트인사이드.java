import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int[] arr = new int[10];
        int idx = 0;
        while (N > 0) {
            arr[idx] = N % 10;
            idx++;
            N /= 10;
        }
        for (int i = 1; i <= idx; i++) {
            for (int j = 0; j < idx - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < idx; i++) {
            sum *= 10;
            sum += arr[i];
        }
        System.out.println(sum);
        scanner.close();
    }
}