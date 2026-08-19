import java.util.*;

class Solution {
    public int[] solution(long begin, long end) {
        int size = (int) (end - begin + 1);
        int[] answer = new int[size];

        for (int i = 0; i < size; i++) {
            long n = begin + i;
            answer[i] = getBlock(n);
        }

        return answer;
    }
    
    private int getBlock(long n) {
        if (n == 1) return 0;

        int max = 1; // 1은 모든 수의 기본 약수

        for (long i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                long quotient = n / i;

                // 1. 몫이 10,000,000 이하이면 가장 큰 약수 확정
                if (quotient <= 10000000) {
                    return (int) quotient;
                }

                // 2. 몫이 10,000,000만을 넘으면 작은 약수 i를 후보로 갱신
                max = (int) i;
            }
        }

        return max;
    }
}