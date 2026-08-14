import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        Map<String, Integer> map1 = new HashMap<>(); // 집합 1
        Map<String, Integer> map2 = new HashMap<>(); // 집합 2
        Map<String, Integer> union = new HashMap<>(); // 합집합
        
        for (int i = 0; i < str1.length() - 1; i++){ // 집합 1 및 합집합 초기화
            boolean isAlphabet = true; // 알파벳 체크
            String e = str1.substring(i, i + 2).toUpperCase(); // 대소구분 X
            
            for (int j = 0; j < e.length(); j++){
                if (!(e.charAt(j) >= 'A' && e.charAt(j) <= 'Z')){
                    isAlphabet = false;
                    break;
                }
            }
            if (isAlphabet){ // 알파벳이면 집합에 추가
                if (map1.containsKey(e))
                    map1.put(e, map1.get(e) + 1);
                else
                    map1.put(e, 1);
                
                if (union.containsKey(e))
                    union.put(e, union.get(e) + 1);
                else
                    union.put(e, 1);
            }
        }
        for (int i = 0; i < str2.length() - 1; i++){ // 위와 같은 방식으로 집합 2 초기화
            boolean isAlphabet = true;
            String e = str2.substring(i, i + 2).toUpperCase();
            
            for (int j = 0; j < e.length(); j++){
                if (!(e.charAt(j) >= 'A' && e.charAt(j) <= 'Z')){
                    isAlphabet = false;
                    break;
                }
            }
            if (isAlphabet){
                if (map2.containsKey(e))
                    map2.put(e, map2.get(e) + 1);
                else
                    map2.put(e, 1);
            }
        }
        
        if (map1.size() == 0 && map2.size() == 0) // 둘다 공집합이면
            return 65536;
                    
        int sumOfIntersection = 0; // 교집합의 크기 구하기
        for (String k1 : map1.keySet()){
            if (map2.containsKey(k1)){
                sumOfIntersection += Math.min(map1.get(k1), map2.get(k1));
            }
        }
        
        for (String k2 : map2.keySet()){ // 최종 합집합 및 합집합의 크기 구하기
            if (union.containsKey(k2)){
                union.put(k2, Math.max(union.get(k2), map2.get(k2)));
            }  
            else
                union.put(k2, map2.get(k2));
        }
        int sumOfUnion = 0;
        for (String k : union.keySet()){
            sumOfUnion += union.get(k);
        }

        double zacard = (double) sumOfIntersection / sumOfUnion * 65536; // 자카드 유사도
        return (int) zacard;
    }
}