import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        long A = Long.parseLong(s.split(" ")[0]);
        long B = Long.parseLong(s.split(" ")[1]);
        br.close();

        System.out.println(lcm(A, B));
    }

    public static long gcd (long A, long B){
        if (B == 0)
            return A;
        else
            return gcd(B, A % B);
    }

    public static long lcm (long A, long B){
        return (A * B) / gcd(A, B);
    }
}