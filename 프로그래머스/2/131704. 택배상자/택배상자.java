import java.util.*;

class Solution {
    public int solution(int[] order) {
        int answer = 0; // 트럭에 실을 수 있는 상자의 수
        Deque<Integer> mainBelt = new ArrayDeque<>(); // 메인 컨테이너 벨트
        Deque<Integer> subBelt = new ArrayDeque<>(); // 보조 컨테이너 벨트
        
        for (int i = 0; i < order.length; i++){ // 1, 2, ... n 순으로 메인 벨트에 상자가 놓여져 있음
            mainBelt.offerLast(i + 1);
        }
        
        int idx = 0;
        while (idx < order.length){
            int wantBox = order[idx]; // 택배 기사가 원하는 상자
            
            if (!subBelt.isEmpty() && subBelt.peekLast() == wantBox){ // 서브 벨트의 맨 앞이 원하는 상자면
                subBelt.pollLast();
                answer++;
                idx++;
                continue;
            }
            
            // 원하는 상자가 나올 때 까지 보조 벨트에 실음
            while (!mainBelt.isEmpty() && mainBelt.peekFirst() != wantBox){ 
                int box = mainBelt.pollFirst();
                subBelt.offerLast(box);
            }
            if (!mainBelt.isEmpty() && mainBelt.peekFirst() == wantBox){ // 메인 벨트의 맨 앞이 원하는 상자면
                mainBelt.pollFirst();
                answer++;
                idx++;
                continue;
            }
            
            if (mainBelt.isEmpty() || mainBelt.peekFirst() != wantBox){ // 메인 벨트가 비었거나 원하는 상자 X
                if (subBelt.isEmpty() || subBelt.peekLast() != wantBox) // 서브 벨트가 비었거나 원하는 상자 X
                    break; // 종료
            }
        }
        
        return answer;
    }
}