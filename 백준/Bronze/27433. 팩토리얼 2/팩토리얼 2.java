import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        long sum = 1;
        for (int i = 2; i <= N; i++) {
            sum *= i;
        }
        System.out.println(sum);
    }
}