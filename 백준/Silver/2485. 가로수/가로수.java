import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] treeArr = new int[N];
        int[] gapArr = new int[N - 1];

        for (int i = 0; i < N; i++) {
            treeArr[i] = Integer.parseInt(br.readLine());
        }
        br.close();

        for (int i = 0; i < N - 1; i++) {
            gapArr[i] = treeArr[i + 1] - treeArr[i];
        }

        int minGcd = gcd(gapArr[0], gapArr[N - 2]);
        for (int i = 1; i < N - 2; i++) {
            int gcd = gcd(gapArr[i], gapArr[i + 1]);
            if (minGcd > gcd) {
                minGcd = gcd;
            }
        }

        int cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            cnt += gapArr[i] / minGcd - 1;
        }
        System.out.println(cnt);
    }

    public static int gcd(int a, int b) { // 최대공약수
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
}