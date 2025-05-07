import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        char[] dials = s.toCharArray();

        int sum = 0;
        for (char dial : dials) {
            if (dial >= 'A' && dial <= 'C') {
                sum += 3;
            } else if (dial >= 'D' && dial <= 'F') {
                sum += 4;
            } else if (dial >= 'G' && dial <= 'I') {
                sum += 5;
            } else if (dial >= 'J' && dial <= 'L') {
                sum += 6;
            } else if (dial >= 'M' && dial <= 'O') {
                sum += 7;
            } else if (dial >= 'P' && dial <= 'S') {
                sum += 8;
            } else if (dial >= 'T' && dial <= 'V') {
                sum += 9;
            }else if (dial >= 'W' && dial <= 'Z') {
                sum += 10;
            }
        }
        System.out.println(sum);

    }
}