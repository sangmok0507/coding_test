import java.util.*;
import java.io.*;

public class Main {

    static Map<String, Integer> words = new HashMap<>();

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String input = br.readLine();
        int N = Integer.parseInt(input.split(" ")[0]);
        int M = Integer.parseInt(input.split(" ")[1]);

        for (int i = 0; i < N; i++) {
            String word = br.readLine();
            if (word.length() >= M && !words.containsKey(word)) {
                words.put(word, 0);
            }
            if (words.containsKey(word)) {
                words.replace(word, words.get(word) + 1);
            }
        }
        br.close();

        List<String> sortedWords = new ArrayList<>(words.keySet());
        Collections.sort(sortedWords, (w1, w2) -> {
            if (words.get(w1) == words.get(w2)) {
                if (w1.length() == w2.length()) {
                   return w1.compareTo(w2);
                }
            }
            if (words.get(w1) == words.get(w2)) {
                return w2.length() - w1.length();
            }
            return words.get(w2) - words.get(w1);
        });

        for (String w : sortedWords) {
            sb.append(w.split("/")[0]).append("\n");
        }
        System.out.println(sb);
    }
}