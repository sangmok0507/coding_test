import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String s = br.readLine();
            int A = Integer.parseInt(s.split(" ")[0]);
            int B = Integer.parseInt(s.split(" ")[1]);
            int min = A < B ? A : B;
            int max = A > B ? A : B;

            int k = 1;
            for (int j = 2; j <= min; j++) {
                if (A % j == 0 && B % j == 0) {
                    k = j;
                }
            }
            sb.append(min * (max / k)).append("\n");
        }
        br.close();
        System.out.println(sb);
    }
}