import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        String n = st.nextToken();
        int b = Integer.parseInt(st.nextToken());

        char[] arr = n.toCharArray();
        int sum = 0;
        int k = 0;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] >= 'A' && arr[i] <= 'Z') {
                sum += Math.pow(b, k++) * (arr[i] - 'A' + 10);
            } else {
                sum += Math.pow(b, k++) * (arr[i] - '0');
            }
        }
        System.out.println(sum);
    }
}