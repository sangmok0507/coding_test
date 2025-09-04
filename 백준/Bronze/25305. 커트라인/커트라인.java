import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int k = scanner.nextInt();
        int[] students = new int[N];

        for (int i = 0; i < N; i++) {
            students[i] = scanner.nextInt();
        }
        for (int i = 0; i < N - 1; i++) {
            for (int j = 0; j < N - 1; j++) {
                if (students[j] < students[j + 1]) {
                    int tmp = students[j];
                    students[j] = students[j + 1];
                    students[j + 1] = tmp;
                }
            }
        }
        System.out.println(students[k - 1]);

        scanner.close();
    }
}