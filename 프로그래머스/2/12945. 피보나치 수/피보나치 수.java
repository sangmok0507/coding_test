class Solution {
    
    public int solution(int n) {
        int answer = 0;
        int[] fivonacci = new int[n + 1];
        fivonacci[0] = 0;
        fivonacci[1] = 1;
        
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        for (int i = 2; i <= n; i++){
            fivonacci[i] = (fivonacci[i - 2] + fivonacci[i - 1]) % 1234567;
        }
        
        return fivonacci[n];
    }
}