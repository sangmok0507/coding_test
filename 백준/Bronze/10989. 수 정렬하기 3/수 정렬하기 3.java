import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] result = new int[n];
        int max = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        br.close();

        int[] counting = new int[max + 1];
        for (int i = 0; i < n; i++) {
            counting[arr[i]]++;
        }
        for (int i = 2; i <= max; i++) {
            counting[i] = counting[i - 1] + counting[i];
        }

        for (int i = 0; i < n; i++) {
            counting[arr[i]]--;
            result[counting[arr[i]]] = arr[i];
        }
        
        for (int i = 0; i < n; i++) {
            sb.append(result[i]).append("\n");
        }
        System.out.println(sb);
    }
}