class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int row = arr1.length; 
        int col = arr2[0].length;
        int[][] answer = new int[row][col]; // 행렬의 곱 결과
        
        for (int i = 0; i < row; i++){ // 행렬의 곱
            for (int idx = 0; idx < col; idx++){
                int sum = 0;
                for (int j = 0; j < arr2.length; j++){
                    sum += arr1[i][j] * arr2[j][idx];
                }
                answer[i][idx] = sum;
            }
        }
   
        return answer;
    }
}