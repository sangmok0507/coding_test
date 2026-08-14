import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> users = new HashMap<>(); // (유저 id, 닉네임) 담을 map
        List<String> results = new ArrayList<>(); // 메시지를 담을 list
        
        for (int i = 0; i < record.length; i++){  // 유저의 닉네임 먼저 저장
            String[] words = record[i].split(" ");
            
            if (words[0].equals("Enter")){
                users.put(words[1], words[2]);
            }
            else if (words[0].equals("Change")){
                users.put(words[1], words[2]);
            }
        }
        for (int i = 0; i < record.length; i++){ // 최종 닉네임대로 다시 메시지 생성
            String[] words = record[i].split(" ");
            
            if (words[0].equals("Enter")){
                results.add(users.get(words[1]) + "님이 들어왔습니다.");
            }
            else if (words[0].equals("Leave")){
                results.add(users.get(words[1]) + "님이 나갔습니다.");
            }
        }
        
        String[] answer = new String[results.size()]; // 메시지를 문자열 배열 형태로 반환
        for (int i = 0; i < answer.length; i++)
            answer[i] = results.get(i);
        return answer;
    }
}