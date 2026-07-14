import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        int[] tmp = new int[1000000];
        int idx = 0;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++){
            if (i == 0){
                deque.offerFirst(arr[i]);
            }
            if (arr[i] != deque.peekFirst()){
                deque.offerFirst(arr[i]);
            }
            
        }
        while(!deque.isEmpty()){
            tmp[idx++] = deque.pollLast();
        }
        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++){
            answer[i] = tmp[i];
        }
        return answer;
    }
}