import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Map<String, Integer> map = new LinkedHashMap<>();
        int k = 1;
        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            map.put(name, k);
            k++;
        }

        StringBuilder sb = new StringBuilder();
        List<String> pokemon = new ArrayList<>(map.keySet());
        for (int i = 0; i < M; i++) {
            String s = br.readLine();
            if (map.containsKey(s)) {
                sb.append(map.get(s)).append("\n");
            } else {
                sb.append(pokemon.get(Integer.parseInt(s) - 1)).append("\n");
            }
        }
        br.close();
        System.out.println(sb);
    }
}