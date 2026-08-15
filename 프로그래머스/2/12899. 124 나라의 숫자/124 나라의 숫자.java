class Solution {
    public String solution(int n) {  
        StringBuilder sb = new StringBuilder();
        
        while (n > 0){
            int k = n % 3;
            
            if (k == 0){ // 나머지가 0이면 몫 - 1하고 4로 치환
                sb.append(4); 
                n = n / 3 - 1;
                continue;
            }
            sb.append(k);
            n /= 3;
        }
        return sb.reverse().toString();
    }
}