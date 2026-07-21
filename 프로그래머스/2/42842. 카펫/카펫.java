import java.util.*;

class Solution {  
    public int[] solution(int brown, int yellow) {
        // 가로 : yellow.width + 2 (즉 최소 3)
        // 세로 : yellow.height + 2 (즉 최소 3)
        int[] answer = new int[2];
        int sum = brown + yellow;
        
        for (int width = 3; width <= sum; width++){
            if (sum % width == 0){
                int height = sum / width;
                if (width < height) 
                    continue;
                
                if ((width - 2) * (height - 2) == yellow){
                    answer[0] = width;
                    answer[1] = height;
                    return answer;
                }
            }
        }
        
        return answer;
    }
}