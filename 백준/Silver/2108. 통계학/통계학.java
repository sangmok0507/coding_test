import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] numbers = new int[N];
        Map<Integer, Integer> counts = new HashMap<>();
        List<Integer> modes = new ArrayList<>();
        int avg, median, mode, range;

        int sum = 0;
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
            sum += numbers[i];
        }
        br.close();
        Arrays.sort(numbers);

        avg = (int) Math.round((double) sum / N);
        median = numbers[N / 2];
        range = numbers[N - 1] - numbers[0];

        for (int i = 0; i < N; i++) {
            if (!counts.containsKey(numbers[i])) {
                counts.put(numbers[i], 1);
            } else {
                counts.replace(numbers[i], counts.get(numbers[i]), counts.get(numbers[i]) + 1);
            }
        }
        int max = 1;
        for (Integer value : counts.values()) {
            if (max < value) {
                max = value;
            }
        }
        for (Integer key : counts.keySet()) {
            if (counts.get(key) == max) {
                modes.add(key);
            }
        }
        Collections.sort(modes);

        if (modes.size() == 1) {
            mode = modes.get(0);
        } else {
            mode = modes.get(1);
        }

        sb.append(avg).append("\n")
                .append(median).append("\n")
                .append(mode).append("\n")
                .append(range);
        System.out.println(sb);
    }
}