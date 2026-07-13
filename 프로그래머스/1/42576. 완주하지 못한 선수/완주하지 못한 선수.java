import java.util.*;
import java.io.*;

class Solution {
    
  public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> marathon = new HashMap<>();
        for (String p : participant){
            if (marathon.containsKey(p)){
                marathon.replace(p, marathon.get(p) + 1);
            }else{
                marathon.put(p, 1);
            }
        }
        for (String c : completion){
            marathon.replace(c, marathon.get(c) - 1);
        }
        
        for (String key : marathon.keySet()){
            if (marathon.get(key) > 0){
                answer = key;
                break;
            }
        }
        return answer;
    }
}