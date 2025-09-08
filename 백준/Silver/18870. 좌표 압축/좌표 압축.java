import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] pts = new int[N];
        int[] sortedPts = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            sortedPts[i] = pts[i] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(sortedPts);

        Map<Integer, Integer> map = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (!(map.containsKey(sortedPts[i]))) {
                map.put(sortedPts[i], cnt++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int p : pts) {
            sb.append(map.get(p)).append(" ");
        }
        System.out.println(sb);
    }
}