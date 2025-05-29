import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int T = scanner.nextInt();
        for (int i = 0; i < T; i++) {
            int money = scanner.nextInt();

            int quarter = money / 25;
            int dime = money % 25 / 10;
            int nickel = money % 25 % 10 / 5;
            int penny = money % 25 % 10 % 5;
            System.out.println(quarter + " " + dime + " " + nickel + " " + penny);
        }

    }
}