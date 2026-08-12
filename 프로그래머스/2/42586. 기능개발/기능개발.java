import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int i = 0; // 반복자
        int sequence = 0; // 배포 순서
        int cnt = 0; // 배포 가능한 기능의 수
        List<Integer> list = new ArrayList<>(); // 각 배포마다 배포되는 수를 저장하는 list
        
        while (sequence < progresses.length){ // 배포가 다 되기 전까지
            if (progresses[i] == 0){ // 배포가 된 것은 pass
                i = (i + 1) % progresses.length;
                continue;
            }
            
            if (progresses[i] < 100){ // 작업 중 일때
                progresses[i] += speeds[i];
                if (cnt > 0){
                    list.add(cnt);
                    cnt = 0;
                }
            }
            else{ // 작업이 완료될 때
                if (i == sequence){ // 배포 순서에 맞는 기능이면
                    progresses[i] = 0; 
                    cnt++;
                    sequence++;
                }
            }
            i = (i + 1) % progresses.length;
        }
        list.add(cnt); // 마지막으로 배포 가능한 기능의 수 추가
        
        int[] answer = new int[list.size()];
        for (int idx = 0; idx < list.size(); idx++){
            answer[idx] = list.get(idx);
        }
        return answer;
    }
}