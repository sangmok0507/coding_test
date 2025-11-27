import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        br.close();

        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int sum = 0;

        while (n > 0) {
            int num = n % b;
            Object numToB;
            if (num >= 10 && num <= b - 1) {
                numToB = (char) (num - 10 + 'A');
            } else {
                numToB = num;
            }
            sb.append(numToB);
            n /= b;
        }
        String result = sb.reverse().toString();
        System.out.println(result);
    }
}