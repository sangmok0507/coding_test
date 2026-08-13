import java.util.*;

class Solution {
    public int solution(int[] topping) {
        int answer = 0;
        Set<Integer> setL = new HashSet<>(); // 등분 기준 왼쪽의 토핑 종류
        Set<Integer> setR = new HashSet<>(); // 등분 기준 오른쪽의 토핑 종류
        Map<Integer, Integer> map = new HashMap<>(); // (토핑 종류, 갯수)
        
        for (int i : topping){ // 왼쪽부터 차례대로 잘라볼거니까 맨 처음엔 오른쪽 등분에 몰아넣기
            setR.add(i);
            if (!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i) + 1);
        }
        
        for (int i = 1; i < topping.length; i++){ // 왼쪽부터 차례대로 자르기
            setL.add(topping[i - 1]);
            map.put(topping[i - 1], map.get(topping[i - 1]) - 1);
            
            if (map.get(topping[i - 1]) == 0)
                setR.remove(topping[i - 1]);
        
            if (setL.size() == setR.size()) // 잘린 조각들이 서로 토핑의 가짓수가 같으면
                answer++;
        }
        
        return answer;
    }
}