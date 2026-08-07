class Solution {
    public int solution(int[] arr) {     
        if (arr.length == 1) // 원소가 1개만 있으면
            return arr[0];
        
        for (int i = 0; i < arr.length - 1; i++){
            int tmp = lcm(arr[i], arr[i + 1]); 
            arr[i + 1] = tmp;
        }
    
        return arr[arr.length - 1];
    }
    
    public int gcd(int a, int b){ // 최대공약수
        if (b == 0)
            return a;
        return gcd(b, a % b);    
    }
    
    public int lcm(int a, int b){ // 최소공배수
        int gcd = gcd(a, b);
        return gcd * (a / gcd) * (b / gcd);
    }
}