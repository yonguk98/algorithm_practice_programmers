import java.util.ArrayList;
import java.util.List;
class Solution {
    
    static boolean[] visited = new boolean[8];
    static int ans = 0;
    static int K = -1;
    static List<Integer> list = new ArrayList<>();
    static int [][] Dungeons;
    
    public int solution(int k, int[][] dungeons) {
        K = k;
        int n = dungeons.length;
        Dungeons = new int[n][2];

        for (int i = 0; i < n; i++) {
            Dungeons[i][0] = dungeons[i][0];
            Dungeons[i][1] = dungeons[i][1];
        }

        dfs(0,n);

        return ans;
    }
    public static void dfs(int r, int n){
        if(r==n){
            // 피로도 계산
            int k = K, count = 0;
            for(Integer i : list){
                if(k >= Dungeons[i][0]){
                    k -= Dungeons[i][1];
                    count += 1;
                }
            }
            ans = Math.max(ans,count);
            return;
        }

        // 조합 찾기
        for (int i = 0; i < Dungeons.length; i++) {
            if(visited[i]) continue;
            visited[i] = true;
            list.add(i);

            dfs(r+1,n);

            visited[i] = false;
            list.remove(list.size()-1);
        }
    }
}