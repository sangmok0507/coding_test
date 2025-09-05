import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();

        String[] words = new String[N];

        for (int i = 0; i < N; i++) {
            words[i] = scanner.nextLine();
        }

        Arrays.sort(words);
        Arrays.sort(words, Comparator.comparing(String::length));
        
        for (int i = 0; i < words.length; i++) {
            if (i < N - 1 && words[i].equals(words[i + 1])) {
                continue;
            }
            System.out.println(words[i]);
        }

        scanner.close();
    }
}