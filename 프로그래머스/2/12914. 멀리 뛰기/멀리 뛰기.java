class Solution {
    public long solution(int n) {
        long[] jump = new long[n + 1];
        jump[0] = 1;
        jump[1] = 1;
        
        if (n <= 1)
            return 1;
        for (int i = 2; i <= n; i++){
            jump[i] = (jump[i - 2] + jump[i - 1]) % 1234567;
        }
        
        return jump[n];
    }
}