import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        int a = Integer.parseInt(s.split(" ")[0]);
        int b = Integer.parseInt(s.split(" ")[1]);

        a = a % 10 * 100 + a % 100 / 10 * 10 + a / 100;
        b = b % 10 * 100 + b % 100 / 10 * 10 + b / 100;

        System.out.println(a > b ? a : b);
    }
}