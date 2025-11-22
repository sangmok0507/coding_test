import java.io.*;
import java.util.*;

public class Main {

    static Map<Integer, List<Integer>> graph = new HashMap<>();
    static Map<Integer, Integer> visited = new HashMap<>();
    static Map<Integer, Integer> order = new HashMap<>();
    static int rank = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int R = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= N; i++) {
            graph.put(i, new ArrayList<>());
            visited.put(i, 0);
            order.put(i, 0);
        }

        for (int i = 0; i < M; i++) {
            String info = br.readLine();
            int u = Integer.parseInt(info.split(" ")[0]);
            int v = Integer.parseInt(info.split(" ")[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        br.close();

        for (Integer key : graph.keySet()) {
            Collections.sort(graph.get(key), Comparator.reverseOrder());
        }
        dfs(R);

        List<Integer> sortedKey = new ArrayList<>(order.keySet());
        Collections.sort(sortedKey);
        for (Integer i : sortedKey) {
            System.out.println(order.get(i));
        }
    }

    private static void dfs(int R) {
        visited.replace(R, 1);
        order.replace(R, rank++);

        for (Integer x : graph.get(R)) {
            if (visited.get(x) == 0) {
                dfs(x);
            }
        }
    }
}