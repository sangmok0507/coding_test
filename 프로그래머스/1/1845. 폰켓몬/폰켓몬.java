import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int cnt = nums.length / 2;
        Map<Integer, Integer> pokemons = new HashMap<>();
        
        for(int n : nums){
            if (pokemons.containsKey(n)){
                pokemons.replace(n, pokemons.get(n) + 1);
            }else{
                pokemons.put(n, 1);
            }
        }
        
        int countOfKeys = pokemons.keySet().size();
        if (countOfKeys < cnt){
            answer = countOfKeys;
        } else {
            answer = cnt;
        }     
        return answer;
    }
}