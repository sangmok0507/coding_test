import java.util.*;

class Solution
{
    public int solution(String s)
    {
        String[] words = s.split("");
        Deque<String> deque = new ArrayDeque<>();
        
        for (int i = 0; i < words.length; i++){
            if (!deque.isEmpty() && deque.peekFirst().equals(words[i])){ // 이전 문자와 같으면 제거
                deque.pollFirst();
                continue;
            }
            deque.offerFirst(words[i]); // 일반적인 경우 추가
        }
        
        if (deque.isEmpty()) // 성공적으로 수행
            return 1;
        return 0;
    }
}