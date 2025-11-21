import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fivonacci(N));
    }

    private static int fivonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fivonacci(n - 1) + fivonacci(n - 2);
    }
}