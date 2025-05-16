import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine().toUpperCase();
        char[] alphabet = new char[word.length()];
        int len = 0;

        for (int i = 0; i < word.length(); i++) {
            int flag = 0;
            for (int j = 0; j < len; j++) {
                if (word.charAt(i) == alphabet[j]) {
                    flag = 1;
                }
            }
            if (flag != 1) {
                alphabet[len] = word.charAt(i);
                len++;
            }
        }

        int[] cnt = new int[len];
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) == alphabet[i]) {
                    cnt[i]++;
                }
            }
        }

        int max = cnt[0];
        char ch = alphabet[0];
        for (int i = 1; i < len; i++) {
            if (max <= cnt[i]) {
                max = cnt[i];
                ch = alphabet[i];
            }
        }

        int duple = 0;
        for (int i : cnt) {
            if (max == i) {
                duple++;
            }
        }
        if (duple > 1) {
            System.out.println("?");
            return;
        }
        System.out.print(ch);

    }
}