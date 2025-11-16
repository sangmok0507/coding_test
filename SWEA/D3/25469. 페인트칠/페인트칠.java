/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;

/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int H = sc.nextInt();
            int W = sc.nextInt();
            sc.nextLine();

            String[][] canvas = new String[H][W];
            for (int j = 0; j < H; j++) {
                String[] row = sc.nextLine().split("");
                for (int k = 0; k < W; k++) {
                    canvas[j][k] = row[k];
                }
            }

            int rowBlack = 0;
            int colBlack = 0;
            for (int j = 0; j < H; j++) {
                if (isRowBlack(canvas, j, W)) {
                    rowBlack++;
                }
            }
            for (int j = 0; j < W; j++) {
                if (isColumnBlack(canvas, H, j)) {
                    colBlack++;
                }
            }

            if (isAllBlack(canvas, H, W)) {
                System.out.println(rowBlack < colBlack ? rowBlack : colBlack);
            } else {
                System.out.println(rowBlack + colBlack);
            }
        }
    }

    private static boolean isRowBlack(String[][] arr, int H, int W) {
        int sum = 0;
        for (int i = 0; i < W; i++) {
            if (arr[H][i].equals("#")) {
                sum++;
            }
        }
        return sum == W;
    }

    private static boolean isColumnBlack(String[][] arr, int H, int W) {
        int sum = 0;
        for (int i = 0; i < H; i++) {
            if (arr[i][W].equals("#")) {
                sum++;
            }
        }
        return sum == H;
    }

    private static boolean isAllBlack(String[][] arr, int H, int W) {
        int sum = 0;
        for (int i = 0; i < H; i++) {
            for (int j = 0; j < W; j++) {
                if (arr[i][j].equals("#")) {
                    sum++;
                }
            }
        }
        return sum == H * W;
    }
}