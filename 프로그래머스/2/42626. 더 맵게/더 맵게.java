import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < scoville.length; i++){
            queue.offer(scoville[i]);
        }
        
        while (queue.size() > 1){  
            if (!isCondition(queue, K)){ // 모두 K 이상이면
                break;
            }
            
            int sum = 0;
            int cnt = 1;
            
            int firstMin = queue.poll();
            sum += firstMin;
            
            int secondMin = queue.poll();
            sum += 2 * secondMin;
            
            queue.offer(sum);
            answer++;
        }

        if (queue.peek() < K){ // 다 합친 값이 K 미만
            return -1;
        }
        return answer;
    }
    
    public boolean isCondition(Queue<Integer> queue, int K){
        for (Integer i : queue){
            if (i < K)
                return true;
        }
        return false;
    }
}