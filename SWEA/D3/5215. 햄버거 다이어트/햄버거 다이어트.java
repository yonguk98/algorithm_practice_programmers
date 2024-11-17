import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            String[] s = br.readLine().split(" ");
            int N = Integer.parseInt(s[0]);
            int L = Integer.parseInt(s[1]);
            int[] value = new int[N+1];
            int[] cal = new int[N+1];

            for (int i = 1; i <= N; i++) {
                s = br.readLine().split(" ");
                value[i] = Integer.parseInt(s[0]);
                cal[i] = Integer.parseInt(s[1]);
            }
            int[][] dp = new int[N+1][L+1];

            for (int i = 1; i <= N; i++) {
                for (int j = 1; j <= L; j++) {
                    if(cal[i] <= j){
                        dp[i][j] = Math.max(dp[i-1][j],dp[i-1][j-cal[i]] + value[i]);
                    } else{
                        dp[i][j] = dp[i-1][j];
                    }
                }
            }
            
            System.out.println("#" + testCase + " " + dp[N][L]);
        }
    }
}