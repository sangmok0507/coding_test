import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int order = Integer.parseInt(st.nextToken());

            switch (order) {
                case 1:
                    deque.offerFirst(Integer.parseInt(st.nextToken()));
                    break;
                case 2:
                    deque.offerLast(Integer.parseInt(st.nextToken()));
                    break;
                case 3:
                    if (!deque.isEmpty()) {
                        sb.append(deque.pollFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case 4:
                    if (!deque.isEmpty()) {
                        sb.append(deque.pollLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                case 5:
                    sb.append(deque.size()).append("\n");
                    break;
                case 6:
                    if (deque.isEmpty()) {
                        sb.append(1);
                    } else {
                        sb.append(0);
                    }
                    sb.append("\n");
                    break;
                case 7:
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekFirst());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
                    break;
                default:
                    if (!deque.isEmpty()) {
                        sb.append(deque.peekLast());
                    } else {
                        sb.append(-1);
                    }
                    sb.append("\n");
            }
        }
        br.close();
        System.out.print(sb);
    }
}