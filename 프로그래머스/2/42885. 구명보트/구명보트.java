import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int left = 0;
        int right = people.length - 1;
        Arrays.sort(people); // 초기화 과정

        // 구명보트엔 최대 2명 탑승 가능
        while (left <= right){  
            if (left == right){ // 혼자 남았을 때
                answer++;
                break;
            }
            
            if (people[left] + people[right] <= limit){ // 최소 무게 + 최대한의 무게 <= 한계
                answer++;
                left++;
                right--;
            } 
            else { // 최소값과 더해도 한계를 넘기면 혼자 보내기
                right--;
                answer++;
            }
        }
        
        return answer;
    }
}