import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<String> names = new HashSet<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        for (int i = 0; i < N; i++) {
            names.add(br.readLine());
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String name = br.readLine();
            if (names.contains(name)) {
                list.add(name);
            }
        }
        br.close();

        Collections.sort(list);
        StringBuilder sb = new StringBuilder();
        sb.append(list.size()).append("\n");
        for (String s : list) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}