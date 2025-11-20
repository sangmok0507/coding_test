import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] numbers = new int[k];

        for (int i = 0; i < k; i++) {
            numbers[i] = sc.nextInt();
        }
        Arrays.sort(numbers);

        if (k == 1) {
            System.out.println((int) Math.pow(numbers[0], 2));
            return;
        }
        System.out.println(numbers[0] * numbers[k - 1]);
    }
}