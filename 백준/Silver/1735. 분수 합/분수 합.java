import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        int a1 = Integer.parseInt(s1.split(" ")[0]);
        int b1 = Integer.parseInt(s1.split(" ")[1]);

        String s2 = br.readLine();
        int a2 = Integer.parseInt(s2.split(" ")[0]);
        int b2 = Integer.parseInt(s2.split(" ")[1]);

        int sumB = lsm(b1, b2);
        int sumA = a1 * (sumB / b1) + a2 * (sumB / b2);
        int gcd = gcd(sumA, sumB);

        System.out.println(sumA / gcd + " " + sumB / gcd);
    }

    public static int gcd(int a, int b) { // 최대공약수
        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }
    }

    public static int lsm(int a, int b) { // 최소공배수
        return (a * b) / gcd(a, b);
    }
}