import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            int sum = 0;
            for (int j = 1; j <= M - N + 1; j++) {
                sum += combination(N - 1, M - j);
            }
            sb.append(sum).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
    private static int combination(int N, int M) {
        double child = 1;
        int parentOne = 2;
        int parentTwo = 2;

        for (int i = 2; i <= M; i++) {
            child *= i;
        }
        while (parentOne <= N) {
            child /= parentOne++;
        }
        while (parentTwo <= M - N) {
            child /= parentTwo++;
        }
        return (int) Math.round(child);
    }
}