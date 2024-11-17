
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution
{
    static int count = 0;
    static int[] visited;
    static int[] queen;
    static int N;
    
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            N = Integer.parseInt(br.readLine());
            visited = new int[N];
            queen = new int[N];
            count = 0;

            backtrack(0);

            System.out.println("#" + testCase + " " + count);
        }
		
	}
    
    public static void backtrack(int depth) {
        if(depth == N) {
            count+=1;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (visited[i] == 1) continue;

            queen[depth] = i;
            if (check(depth)){
                visited[i] = 1;
                backtrack(depth+1);
                visited[i] = 0;
            }
        }

    }

    public static boolean check(int current){
        for (int i = 0; i < current; i++) {
            if (queen[current] == queen[i] || current - i == Math.abs(queen[current] - queen[i])) {
                return false;
            }
        }
        return true;
    }
}