import java.util.*;

class Solution {
    public int solution(String s) {
        int answer = 0; 
        int x = 0; // 회전 횟수
        char[] arr = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();
        
        while (x < s.length()){ // 0 <= x < s의 길이
            for (int i = 0; i < arr.length; i++){
                if (stack.isEmpty()) // 스택이 비어있으면
                    stack.offerLast(arr[i]);
                else {
                    if (stack.peekLast() == '[' && arr[i] == ']') // 대괄호 검사
                        stack.pollLast();
                    else if (stack.peekLast() == '{' && arr[i] == '}') // 중괄호 검사
                        stack.pollLast();
                    else if (stack.peekLast() == '(' && arr[i] == ')') // 소괄호 검사
                        stack.pollLast();
                    else // 나머지는 push
                        stack.offerLast(arr[i]);
                }
            }
            if (stack.isEmpty()) // 올바른 괄호 문자열이면
                answer++;
            
            // 문자열 회전 및 스택 초기화
            char tmp = arr[0];
            for (int i = 0; i < arr.length - 1; i++){
                arr[i] = arr[i + 1];
            }
            arr[arr.length - 1] = tmp;
            stack.clear();
            x++;
        }
        
        return answer;
    }
}