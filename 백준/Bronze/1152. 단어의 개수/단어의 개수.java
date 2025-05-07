import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] split = s.split(" ");

        int length = split.length;
        if (length > 0) {
            if (split[0].isEmpty()) {
                length--;
            }
        }
        System.out.println(length);
    }
}