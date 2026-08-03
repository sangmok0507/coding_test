class Solution {
    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ", -1); // 공백 포함하기 위해 제한 해제
        
        for (int i = 0; i < words.length; i++){   
            if (words[i].isEmpty()){
                continue;
            }
            char firstWord = words[i].charAt(0);
            String otherWord = words[i].substring(1);
            
            if (firstWord >= 'a' && firstWord <= 'z'){
                firstWord = (char) (firstWord - 'a' + 'A');
            }
            String changedWord = String.valueOf(firstWord);
            words[i] = changedWord.concat(otherWord.toLowerCase());
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length - 1; i++){
            sb.append(words[i]).append(" ");
        }
        sb.append(words[words.length - 1]);   
        
        answer = sb.toString();
        System.out.print(answer);
        return answer;
    }
}