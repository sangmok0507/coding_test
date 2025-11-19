import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int child = 1;
        int parentOne = 1;
        int parentTwo = 1;

        for (int i = 2; i <= N; i++) {
            child *= i;
        }
        for (int i = 2; i <= K; i++) {
            parentOne *= i;
        }
        for (int i = 2; i <= N - K; i++) {
            parentTwo *= i;
        }
        System.out.println(child / parentOne / parentTwo);
    }
}