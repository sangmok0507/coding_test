import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        int[] patternOne = {1, 2, 3, 4, 5};  // 1번: 12345... 5개
        int[] patternTwo = {2, 1, 2, 3, 2 ,4, 2 ,5}; // 2번: 21232425... 8개 (짝수 index는 2)
        int[] patternThree = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5}; // 3번: 3311224455... 10개 
        int[] scores = new int[3];
        
        for (int i = 0; i < answers.length; i++){
            if (answers[i] == patternOne[i % patternOne.length]) 
                scores[0]++;
            if (answers[i] == patternTwo[i % patternTwo.length]) 
                scores[1]++;
            if (answers[i] == patternThree[i % patternThree.length]) 
                scores[2]++;
        }
    
        int maxScore = 0;
        for (int s : scores){
            if (maxScore < s)
                maxScore = s;
        }
        
        int[] tmp = new int[3];
        int idx = 0;
        for (int i = 0; i < scores.length; i++){
            if (scores[i] == maxScore)
                tmp[idx++] = i + 1;
        }
        
        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++){
            answer[i] = tmp[i];
        }
        Arrays.sort(answer);
        
        return answer;
    }
}