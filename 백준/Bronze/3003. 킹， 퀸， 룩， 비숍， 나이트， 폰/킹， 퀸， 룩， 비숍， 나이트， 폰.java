import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] split = input.split(" ");
        int[] white = {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            System.out.print(white[i] - Integer.parseInt(split[i]) + " ");
        }

    }
}