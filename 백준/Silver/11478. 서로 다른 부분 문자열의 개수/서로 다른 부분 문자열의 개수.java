import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();

        Set<String> map = new HashSet<>();
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= s.length() && j + i <= s.length(); j++) {
                String word = s.substring(j, j + i);
                if (map.contains(word)) {
                    continue;
                }
                map.add(word);
            }
        }
        
        System.out.println(map.size());
    }
}