import java.util.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0; // 할인받을 수 있는 날짜의 총 일수
        Map<String, Integer> productMap = new HashMap<>(); // 원하는 제품과 개수
        Map<String, Integer> discountMap = new HashMap<>(); // 할인하는 제품과 개수 
        
        for (int i = 0; i < want.length; i++){
            productMap.put(want[i], number[i]);   
        }
        for (int i = 0; i <= discount.length - 10; i++){
            boolean isProductNone = false; // 원하는 제품 있는지 체크
            boolean isCountSame = true; // 개수 동일 체크
            
            for (int j = i; j < i + 10; j++){
                if (!discountMap.containsKey(discount[j]))
                    discountMap.put(discount[j], 1);
                else
                    discountMap.put(discount[j], discountMap.get(discount[j]) + 1);
            }
            for (String p : productMap.keySet()){
                if (!discountMap.containsKey(p))
                    isProductNone = true;
                else {
                    if (productMap.get(p) != discountMap.get(p))
                        isCountSame = false;
                }
            }
        
            if (!isProductNone){ // 1. 원하는 제품 유무 확인
                if (isCountSame) // 2. 개수 동일한지 확인
                    answer++;
            } 
            discountMap.clear();
        }
        return answer;
    }
}