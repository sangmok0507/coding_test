import java.util.*;

class Solution {     
    
    class Process{
        int location;
        int priority;
        
        Process(int location, int priority){
            this.location = location;
            this.priority = priority;
        }
    }    
    
    public int solution(int[] priorities, int location) {
        int answer = 1;
        Deque<Process> deque = new ArrayDeque<>();
        for (int i = 0;  i < priorities.length; i++){
            deque.offerLast(new Process(i, priorities[i]));
        }

        while (!deque.isEmpty()){
            Process importantProcess = new Process(0, 0);
            for (Process p : deque){
                if (importantProcess.priority < p.priority){
                    importantProcess = p;
                }
            }
            
            while(deque.peekFirst().priority != importantProcess.priority){
                Process tmp = deque.pollFirst();
                deque.offerLast(tmp);
            }
            if (deque.peekFirst().location == location){
                break;
            }
            deque.pollFirst();
            answer++;
        }
        
        return answer;
    }
}