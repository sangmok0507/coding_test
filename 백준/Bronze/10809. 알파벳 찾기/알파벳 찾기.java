import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (s.contains(ch + "")) {
                System.out.print(s.indexOf(ch) + " ");
            } else {
                System.out.print("-1 ");
            }
        }
    }
}