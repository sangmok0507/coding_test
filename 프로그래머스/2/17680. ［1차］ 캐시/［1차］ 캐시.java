import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        Map<String, Integer> map = new HashMap<>(); // (도시이름, 순서)를 담을 map 
        
        if (cacheSize == 0){ // 캐시 사이즈가 0일 때
            for (int i = 0; i < cities.length; i++)
                answer += 5;
            return answer;
        }
        
        for (int i = 0; i < cities.length; i++){
            String city = cities[i].toUpperCase(); // 대소문자 구분 X
            
            if (map.containsKey(city)){ // cache hit
                map.put(city, i);
                answer += 1;
            }
            else{ // cache miss
                if (map.size() < cacheSize){ // 캐시가 비어있으면
                    map.put(city, i);
                }
                else{ // 캐시가 full 이면
                    int min = 100000;
                    String c = "";
                    for (String key : map.keySet()){
                        if (map.get(key) < min){
                            min = map.get(key);
                            c = key;
                        }
                    }
                    map.remove(c);
                    map.put(city, i);
                }       
                answer += 5;
            }
        }
        return answer;
    }
}