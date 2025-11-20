import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> log = new HashSet<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String user = br.readLine();
            if (user.equals("ENTER")) {
                log.clear();
            } else {
                if (!log.contains(user)) {
                    log.add(user);
                    cnt++;
                }
            }
        }
        br.close();
        System.out.println(cnt);
    }
}