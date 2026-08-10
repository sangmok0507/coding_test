class Solution
{
    public int solution(int n, int a, int b){
        int answer = 0;
        
        while (n > 1){
            int mid = n / 2;
            
            if (a <= mid && b > mid || a > mid && b <= mid){ // 다른 브래킷
                n /= 2;
                answer++;
                a = n / 2;
                b = n / 2 + 1;
            }
            else { // 같은 브래킷
                if (a + 1 == b || a - 1 == b){ // 첫 경기부터 만남
                    answer++;
                    break;
                }
                else { // 다른 경기부터 해야됨
                    n = mid;
                    if (a > n && b > n){
                        a -= n;
                        b -= n;
                    }
                }
            }
        }
        return answer;
    }
}