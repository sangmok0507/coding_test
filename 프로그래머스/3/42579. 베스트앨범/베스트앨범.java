import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        int[] unique = new int[10000];
        int idx = 0;
        Map<Integer, String> genre = new HashMap<>();
        Map<Integer, Integer> cnt = new HashMap<>();
        Map<String, Integer> sum = new HashMap<>();
        Set<Integer> select = new HashSet<>();
        
        for (int i = 0; i < genres.length; i++){
            genre.put(i, genres[i]);
            cnt.put(i, plays[i]);
            if (!sum.containsKey(genres[i])){
                sum.put(genres[i], plays[i]);
            }else{
                sum.replace(genres[i], sum.get(genres[i]) + plays[i]);
            }
        }
        
        while(!sum.isEmpty()){
            int limit = 0;
            int maxSum = 0;
            String maxGenre = "";
            for (String s : sum.keySet()){
                if (maxSum < sum.get(s)){
                    maxSum = sum.get(s);
                    maxGenre = s;
                }
            }    
            for (Integer i : genre.keySet()){
                if (genre.get(i).equals(maxGenre)){
                    select.add(i);
                }
            }
            while(limit < 2 && !select.isEmpty()){
                int maxNum = 0;
                int maxCnt = 0;
                for (Integer i : select){
                    if (maxCnt < cnt.get(i)){
                         maxNum = i;
                         maxCnt = cnt.get(i);
                    }
                }
                unique[idx++] = maxNum;
                select.remove(maxNum);
                limit += 1;
            }
            sum.remove(maxGenre);
            select.clear();
        }
        
        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++){
            answer[i] = unique[i];
        }
        return answer;
    }
}