import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String[] words = br.readLine().split("");
            StringBuilder sb = new StringBuilder();
            int flag = 0;
            String prior = "";

            for (String w : words) {
                if (sb.toString().contains(w)) {
                    if (!w.equals(prior)) {
                        flag = 1;
                        break;
                    }
                } else {
                    sb.append(w);
                }
                prior = w;
            }

            if (flag == 0) {
                cnt++;
            }
        }
        br.close();
        System.out.println(cnt);
    }
}