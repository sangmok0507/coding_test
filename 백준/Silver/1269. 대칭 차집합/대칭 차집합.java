import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Set<Integer> A = new HashSet<>();
        Set<Integer> B = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        StringTokenizer stA = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            A.add(Integer.parseInt(stA.nextToken()));
        }
        StringTokenizer stB = new StringTokenizer(br.readLine());
        for (int i = 0; i < m; i++) {
            B.add(Integer.parseInt(stB.nextToken()));
        }
        br.close();

        Set<Integer> A_B = new HashSet<>(A);
        Set<Integer> B_A = new HashSet<>(B);
        for (Integer e : A) {
            if (B.contains(e)) {
                A_B.remove(e);
            }
        }
        for (Integer e : B) {
            if (A.contains(e)) {
                B_A.remove(e);
            }
        }
        System.out.println(A_B.size() + B_A.size());
    }
}