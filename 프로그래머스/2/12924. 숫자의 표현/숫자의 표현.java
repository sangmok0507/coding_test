import java.util.*;

class Solution {
    public int solution(int n) {
        int answer = 1; // 자기 자신 포함
        List<Integer> divisorList = new ArrayList<>(); // n의 약수의 배열리스트
        
        for (int i = 3; i < n; i++){
            if (n % i == 0 && i % 2 != 0) // n의 약수이면서 홀수일 때
                divisorList.add(i);
        }
        
        for (Integer e : divisorList){
            answer++;
        }
        if (n % 2 != 0){ // n이 홀수면 연속된 두 수의 합이 무조건 가능 (1+2, 2+3, ...)
            if (n == 1) // 1은 예외
                return 1;
            answer++;
        }
        
        return answer;
    }
}