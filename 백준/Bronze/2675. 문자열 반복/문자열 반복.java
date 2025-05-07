import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int t = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < t; i++) {
            String s = scanner.nextLine();
            int p = Integer.parseInt(s.split(" ")[0]);
            String str = s.split(" ")[1];

            for (int j = 0; j < str.length(); j++) {
                for (int k = 0; k < p; k++) {
                    System.out.print(str.charAt(j));
                }
            }
            System.out.println();
        }
    }
}