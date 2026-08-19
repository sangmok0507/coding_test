class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        
        // 가로 세로가 d인 삼각형 안에 있어야 됨
        for (int y = 0; y <= d; y += k){
            double x = Math.pow(d, 2) - Math.pow(y, 2);
            x = Math.sqrt(x);
            
            int value = (int) x / k + 1; // x = 0 일때 포함하기 위해 +1
            answer += value;
        } 
        return answer;
    }
}