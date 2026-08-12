import java.util.*;

class Solution {
    public int solution(int[] citations) {
        Deque<Integer> deque = new ArrayDeque<>(); // H-Index 값들을 저장할 덱
        Arrays.sort(citations);
        
        for (int h = 0; h <= citations[citations.length - 1]; h++){
            int upCount = 0; // h번 이상 인용된 논문 개수
            int downCount = 0; // h번 이하 인용된 논문 개수
            
            for (int i = 0; i < citations.length; i++){
                if (citations[i] >= h)
                    upCount++;
                if (citations[i] <= h)
                    downCount++;
            }
            if (upCount >= h && downCount <= h) // 조건을 만족하면 저장 
                deque.offerLast(h);
        }
        
        if (deque.isEmpty()) // H-Index 값이 존재하지 않으면
            return 0;
        return deque.pollLast(); // H의 최댓값 반환
    }
}