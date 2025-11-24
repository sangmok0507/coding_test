import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] croatiaAlphabets = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        String word = br.readLine();
        br.close();

        int cnt = 0;
        for (String croatiaAlphabet : croatiaAlphabets) {
            while (word.contains(croatiaAlphabet)) {
                word = word.replaceFirst(croatiaAlphabet, "_");
                cnt++;
            }
        }
        for (String w : word.split("")) {
            if(!w.equals("_")){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}