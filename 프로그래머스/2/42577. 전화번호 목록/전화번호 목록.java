import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        Set<String> phoneNumbers = new HashSet<>();
        
        for (String pb : phone_book){
            phoneNumbers.add(pb);
        }
        
        for (String pn : phoneNumbers){
            for (int i = 1; i < pn.length(); i++){
                if (phoneNumbers.contains(pn.substring(0, i)))
                    return false;
            }
        }
        
        return answer;
    }
}