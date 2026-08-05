class Solution {
    
    public int solution(int n) {
        int countOfN = 0;
        String convertedN = findConvertedNumber(n);
        for (int i = 0; i < convertedN.length(); i++){
            if (convertedN.charAt(i) == '1')
                countOfN++; // 2진수 변환한 n의 1의 갯수
        }
        
        for (int i = n + 1; ; i++){ // 조건 1: n보다 큰 자연수
            String convertedNumber = findConvertedNumber(i);
            int countOfNumber = 0;
            
            for (int j = 0; j < convertedNumber.length(); j++){
                if (convertedNumber.charAt(j) == '1')
                    countOfNumber++; // 2진수 변환한 i의 1의 갯수
            }
            if (countOfNumber == countOfN) // 조건 2: 변환한 두 수의 1의 개수가 같음
                return i; // 조건 3: 그 중에서 가장 작은 수
        }
    }
    
    public String findConvertedNumber(int k){ // 2진수 변환
        StringBuilder sb = new StringBuilder();     
        
        while (k > 0){
            if (k % 2 == 0)
                sb.append("0");
            else
                sb.append("1");
            k /= 2;
        }
       return sb.reverse().toString(); 
    }
}