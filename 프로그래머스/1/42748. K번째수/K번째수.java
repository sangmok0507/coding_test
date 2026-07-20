import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] tmp = new int[50];
        int idx = 0;
        
        for (int i = 0; i < commands.length; i++){
            List<Integer> arrayList = new ArrayList<>();
            for (int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++){
                arrayList.add(array[j]);
            }
            arrayList.sort(null); // naturalOrder
            
           // if (arrayList.size() < commands[i][2]){
            //    tmp[idx++] = arrayList.get(0);
           // } else{
                tmp[idx++] = arrayList.get(commands[i][2] - 1);
           // }
            arrayList.clear();
        }
        
        int[] answer = new int[idx];
        for (int i = 0; i < idx; i++){
            answer[i] = tmp[i];
        }
        return answer;
    }
}