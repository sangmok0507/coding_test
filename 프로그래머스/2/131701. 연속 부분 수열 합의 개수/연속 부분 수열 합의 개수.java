import java.util.*;

class Solution {
    public int solution(int[] elements) {
        int total = 0; // 배열의 총합
        Set<Integer> set = new HashSet<>(); // 연속 부분 수열 합의 집합
        for (int e : elements){
            total += e;
        }
        set.add(total); 
        
        for (int i = 0; i < elements.length - 1; i++){
            int left = 0;
            int right = i;
            
            while (left < elements.length){ // 원형 수열을 다 돌기 전까지
                int sum = 0;
                if (left <= right){
                    for (int j = left; j <= right; j++){
                        sum += elements[j];
                    }
                }
                else{ // L > R 이면 총합에서 R과 L사이의 값을 뺌
                    sum = total;
                    for (int j = right + 1; j < left; j++){
                        sum -= elements[j];
                    }
                }
                
                if (!set.contains(sum)) // 중복되는 값 제외
                    set.add(sum);
                left++;
                right = (right + 1) % elements.length;
            }
        }
        
        return set.size();
    }
}