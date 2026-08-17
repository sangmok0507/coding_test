import java.util.*;

class Solution {
    public int solution(int[][] data, int col, int row_begin, int row_end) {
        
        Arrays.sort(data, (a, b) -> { // 정렬 과정
            if (a[col - 1] == b[col - 1])
                return b[0] - a[0];
            return a[col - 1] - b[col - 1];
        });
        
        int answer = 0; 
        for (int i = row_begin - 1; i < row_end; i++){ // bitwise XOR 연산 과정
            int sum = 0;
            for (int e : data[i])
                sum += e % (i + 1);
            answer = answer ^ sum;
        }
        return answer;
    }
}