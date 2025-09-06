import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] pts = new int[N][2];
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            pts[i][0] = Integer.parseInt(st.nextToken());
            pts[i][1] = Integer.parseInt(st.nextToken());
        }
        br.close();

        Arrays.sort(pts, (pt1,pt2)->{
            if (pt1[0] == pt2[0]) {
                return pt1[1] - pt2[1];
            }
            return pt1[0] - pt2[0];
        });

        for (int i = 0; i < N; i++) {
            System.out.println(pts[i][0] + " " + pts[i][1]);
        }
    }
}