class Solution {
    public int[] solution(int n, long left, long right) {
        int idx = 0;
        int size = (int) (right - left + 1);
        int[] answer = new int[size];
        
        while (left <= right){ // left ~ right 잘라내기
            int a = (int) (left / n + 1); // 2차원 idx -> 1차원 idx로 변경 후 n으로 나눈 후의 몫
            int b = (int) (left % n + 1); // 2차원 idx -> 1차원 idx로 변경 후 n으로 나눈 후의 나머지
            int max = Math.max(a, b); // 둘 중 큰 값이 2차원 idx의 값 
            
            answer[idx++] = Math.max(a, b);
            left++;
        }
        return answer;
    }
}