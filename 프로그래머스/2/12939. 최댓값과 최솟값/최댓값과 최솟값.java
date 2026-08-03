import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        List<Integer> arrayList = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s);
        StringBuilder sb = new StringBuilder();
        
        while (st.hasMoreTokens()){
            arrayList.add(Integer.parseInt(st.nextToken()));
        }
        arrayList.sort(null);
        
        sb.append(arrayList.get(0))
            .append(" ")
            .append(arrayList.get(arrayList.size() - 1));
        answer = sb.toString();
        
        return answer;
    }
}