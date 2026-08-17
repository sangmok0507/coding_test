import java.util.*;

class Solution {
    public double[] solution(int k, int[][] ranges) {
        List<Integer> collatzList = new ArrayList<>(); // 콜라츠 추측 수 담을 리스트
        collatzList.add(k);
        
        while (k > 1){ // 추측 과정 및 결과 저장
            if (k % 2 == 0)
                k /= 2;
            else
                k = k * 3 + 1; 
            collatzList.add(k);
        }
        
        double[] area = new double[collatzList.size() - 1]; // [i, i + 1]의 정적분 결과 저장
        for (int i = 0; i < area.length; i++){
            area[i] = (collatzList.get(i) + collatzList.get(i + 1)) / 2.0;
        }
        
        double[] answer = new double[ranges.length];
        for (int i = 0; i < ranges.length; i++){ 
            double sum = 0.0;
            int a = ranges[i][0];
            int b = ranges[i][1];
            int n = collatzList.size() - 1;
            
            if (a > n + b){ // 구간의 시작점이 끝점보다 크면
                answer[i] = -1.0;
                continue;
            }
            for (int j = a; j < n + b; j++){ // 구간의 정적분 값 구하기
                sum += area[j];
            }
            answer[i] = sum;
        }
        return answer;
    }
}