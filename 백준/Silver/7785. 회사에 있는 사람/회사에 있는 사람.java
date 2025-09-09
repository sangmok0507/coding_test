import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Set<String> company = new HashSet<>();
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String log = st.nextToken();
            if (log.equals("enter")) {
                company.add(name);
            } else {
                company.remove(name);
            }
        }
        br.close();

        List<String> sortedCompany = new ArrayList<>(company);
        Collections.sort(sortedCompany,(n1,n2)->{
            return n2.compareTo(n1);
        });

        StringBuilder sb = new StringBuilder();
        for (String s : sortedCompany) {
            sb.append(s).append("\n");
        }
        System.out.println(sb);
    }
}