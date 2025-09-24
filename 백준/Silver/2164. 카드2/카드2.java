import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = 1; i <= N; i++) {
            deque.offer(i);
        }
        while (deque.size() > 1) {
            deque.pollFirst();
            int top = deque.poll();
            deque.offer(top);
        }
        System.out.println(deque.peek());
    }
}