import java.util.*;

class Solution {
     public int solution(int k, int[] tangerine) {
        int answer = 0;
        int max = 0;
        for (int i = 0; i < tangerine.length; i++){
            if (max < tangerine[i])
                max = tangerine[i];
        }
        int[] orange = new int[max + 1];
        for (int i = 0; i < tangerine.length; i++){
            orange[tangerine[i]]++;
        }
        Arrays.sort(orange); // 초기화 과정
        
        int cnt = 0;
        int idx = orange.length - 1;
        while (cnt < k){ // 판매 과정
            if (orange[idx] >= k){ // 가장 개수가 많은 '크기의 귤'부터 판매
                answer++;
                break;
            }
            cnt += orange[idx];
            idx--;
            answer++;
        } 
         
        return answer;
    }
}