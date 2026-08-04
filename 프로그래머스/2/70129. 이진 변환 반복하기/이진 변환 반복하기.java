class Solution {
    public int[] solution(String s) {
        int cnt = 0; // 이진 변환 횟수
        int removeZero = 0; // 제거된 모든 0의 갯수
        
        while (!s.equals("1")){ // s가 "1"이 될 때까지
            int length = s.length();
            s = s.replaceAll("0", ""); // 0 제거
            
            int changedLength = s.length(); // 0 제거 후 길이
            removeZero += length - changedLength;
            
            StringBuilder sb = new StringBuilder(); 
            while (changedLength > 0){ // 이진 변환
                if (changedLength % 2 == 0)
                    sb.append("0");
                else
                    sb.append("1");
                changedLength /= 2;
            }
            sb.reverse();
            s = sb.toString(); // 이진 변환 결과
            cnt++; 
        }
        
        int[] answer = {cnt, removeZero}; 
        return answer;
    }
}