import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
class Solution
{
    static int N;
    static int M;
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            // 입출력
            String[] s = br.readLine().split(" ");
            N = Integer.parseInt(s[0]);
            M = Integer.parseInt(s[1]);

            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                String[] input = br.readLine().split(" ");
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(input[j]);
                }
            }

            // 완전탐색
            int sum = 0;
            int max = 0;
            for (int i = 0; i <= N - M; i++) {
                for (int j = 0; j <= N - M; j++) {
                    for (int k = 0; k < M; k++) {
                        for (int l = 0; l < M; l++) {
                            sum += arr[i + k][j + l];
                        }
                    }

                    max = Math.max(max, sum);
                    sum = 0;
                }
            }

            System.out.println("#" + testCase + " " + max);
        }
	}
}