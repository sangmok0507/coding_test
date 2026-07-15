import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Deque<Character> deque = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++){
            deque.offerFirst(s.charAt(i));
            if (i > 0){
                char prior = deque.peekLast();
                if (prior == '(' && s.charAt(i) == ')'){
                    deque.pollFirst();
                    deque.pollFirst();
                }
            }
        }
        
        if (!deque.isEmpty()){
            return false;
        }
        return answer;
    }
}