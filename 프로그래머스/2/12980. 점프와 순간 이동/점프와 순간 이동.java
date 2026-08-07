public class Solution {
    public int solution(int n) {
        int ans = 0;
        
        while (n > 0){ // 거리의 끝부터 출발
            if (n % 2 == 0){ // 짝수면 순간이동
                n /= 2;
            }
            else{ // 홀수면 한 칸 점프 후 건전지 사용
                n -= 1;
                ans++;
            }
        }
        return ans;
    }
}