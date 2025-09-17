import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<String> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        String s = "";

        while (!s.equals(".")) {
            s = br.readLine();
            if (s.equals(".")) {
                continue;
            }
            String[] words = s.split("");
            for (String w : words) {
                if (w.equals("(") || w.equals("[")) {
                    stack.push(w);
                }
                if (w.equals(")")) {
                    if (!stack.isEmpty() && stack.peek().equals("(")) {
                        stack.pop();
                    } else {
                        stack.push(w);
                    }
                }
                if (w.equals("]")) {
                    if (!stack.isEmpty() && stack.peek().equals("[")) {
                        stack.pop();
                    } else {
                        stack.push(w);
                    }
                }
            }
            if (stack.isEmpty()) {
                sb.append("yes");
            } else {
                sb.append("no");
            }
            sb.append("\n");
            stack.clear();
        }
        br.close();

        System.out.println(sb);
    }
}