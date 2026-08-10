import java.util.*;

class Solution {
    public int[] solution(int n, String[] words){
        int cnt = 0;
        char lastWord = '0'; // 단어의 마지막 문자
        List<List<String>> peopleList = new ArrayList<>();
        Set<String> wordSet = new HashSet<>();
        
        for (int i = 0; i < n; i++){
            peopleList.add(new ArrayList<>());
        }
        for (int i = 0; i < words.length; i++){ // 각 사람당 말한 단어 저장
            peopleList.get(cnt).add(words[i]);
            cnt++;
            if (cnt == n)
                cnt = 0;
        }
        for (int i = 0; i < peopleList.get(0).size(); i++){
            for (int j = 0; j < n; j++){
                List<String> person = peopleList.get(j);
                if (person.size() <= i) // 탈락자가 생기지 않을 경우
                    break;
                
                String word = person.get(i);
                if (wordSet.contains(word)) // 이전에 등장한 단어면
                    return new int[]{j + 1 , i + 1};
                if (word.length() == 1) // 단어가 한 글자면
                    return new int[]{j + 1 , i + 1};
                if (!(i == 0 && j == 0) && lastWord != word.charAt(0)) // 끝말잇기가 아니면
                    return new int[]{j + 1 , i + 1};
                
                lastWord = word.charAt(word.length() - 1);
                wordSet.add(word);
            }
        }
        
        return new int[]{0, 0};
    }
}