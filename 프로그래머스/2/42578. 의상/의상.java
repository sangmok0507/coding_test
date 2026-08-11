import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> map = new HashMap<>();
        
        for (int i = 0; i < clothes.length; i++){ // 의상의 종류, 개수로 Map에 저장
            if (!map.containsKey(clothes[i][1]))
                map.put(clothes[i][1], 1);
            else
                map.put(clothes[i][1], map.get(clothes[i][1]) + 1);
        }
        
        for (String key : map.keySet()){ // 모든 경우의 수: (a + 1) * (b + 1) * ...
            answer *= map.get(key) + 1; // 이름1, 이름2.... + 1 (안입을 때)
        }
        return answer - 1; // 모든 경우의 수 - 1 (알몸일 때)
    }
}