import java.io.*;
import java.util.*;

public class Main {

    static int n, m;
    static int[] arr;
    static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        br.close();

        arr = new int[n + 1];

        backTracking(0);
        String answer = sb.toString();
        System.out.println(answer);
    }

    public static void backTracking(int cnt) {
        if (cnt == m) {
            for (int i = 1; i <= m; i++) {
                sb.append(arr[i]).append(" ");
            }
            sb.append("\n");
            return;
        }

        for (int i = 1; i <= n; i++) {
            arr[cnt + 1] = i;
            backTracking(cnt + 1);
        }
    }
}