import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            if (n == -1) {
                break;
            }

            int sum = 0;
            int idx = 0;
            int[] arr = new int[100000];
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    arr[idx++] = i;
                }
            }
            if (sum == n) {
                System.out.print(n + " = ");
                for (int i = 0; i < idx; i++) {
                    System.out.print(arr[i]);
                    if (i != idx - 1) {
                        System.out.print(" + ");
                    }
                }
                System.out.println();
            } else System.out.println(n + " is NOT perfect.");
        }
    }
}