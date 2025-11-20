import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<String, Integer> log = new HashMap<>();
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            String people = br.readLine();
            String firstPerson = people.split(" ")[0];
            String secondPerson = people.split(" ")[1];

            addPerson(log, firstPerson);
            addPerson(log, secondPerson);
            if (log.get(firstPerson) == 1 || log.get(secondPerson) == 1) {
                log.replace(firstPerson, 1);
                log.replace(secondPerson, 1);
            }
        }

        for (Integer value : log.values()) {
            if (value == 1) {
                cnt++;
            }
        }

        br.close();
        System.out.println(cnt);
    }

    private static void addPerson(Map<String, Integer> log, String person) {
        if (!log.containsKey(person)) {
            if (person.equals("ChongChong")) {
                log.put(person, 1);
            } else {
                log.put(person, 0);
            }
        }
    }
}