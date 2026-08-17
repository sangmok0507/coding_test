import java.util.*;

class Solution {
    public int solution(int[] arrayA, int[] arrayB) {
        int gcdA = 1; // 배열 A의 최대공약수
        int gcdB = 1; // 배열 B의 최대공약수
        boolean isConditionOne = true; // 조건 1 판별
        boolean isConditionTwo = true; // 조건 2 판별
        
        Arrays.sort(arrayA); // 오름차순 정렬
        Arrays.sort(arrayB);
        
        if (arrayA.length == 1) // 카드가 1개면 그 수가 최대 공약수
            gcdA = arrayA[0];
        for (int i = 0; i < arrayA.length - 1; i++){
            if (i == 0){
                gcdA = gcd(arrayA[i], arrayA[i + 1]);
                continue;
            }
            gcdA = gcd(gcdA, arrayA[i + 1]);
        }
        
        if (arrayA.length == 1)
            gcdB = arrayB[0];
        for (int i = 0; i < arrayB.length - 1; i++){
            if (i == 0){
                gcdB = gcd(arrayB[i], arrayB[i + 1]);
                continue;
            }
            gcdB = gcd(gcdB, arrayB[i + 1]);
        }
        
        for (int i = 0; i < arrayB.length; i++){ // 조건 1 판별 과정
            if (arrayB[i] % gcdA == 0){
                isConditionOne = false;
                break;
            }
        }
        for (int i = 0; i < arrayA.length; i++){ // 조건 2 판별 과정
            if (arrayA[i] % gcdB == 0){
                isConditionTwo = false;
                break;
            }
        }
        
        if (isConditionOne && isConditionTwo)
            return Math.max(gcdA, gcdB);
        if (isConditionOne)
            return gcdA;
        if (isConditionTwo)
            return gcdB;
        return 0;
    }
    
    public int gcd(int a, int b){
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}