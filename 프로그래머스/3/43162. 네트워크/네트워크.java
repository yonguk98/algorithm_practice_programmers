class Solution {
    
    static boolean[] visited;
    
    public static int solution(int n, int[][] computers) {
        int answer = 0;

        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if(!visited[i]) {
                answer+=1;
                dfs(i,computers);
            }
        }

        return answer;
    }

    public static void dfs(int n, int[][] computers) {
        visited[n] = true;

        for (int i = 0; i < computers.length; i++) {
            if(!visited[i] && computers[n][i] == 1) {
                dfs(i, computers);
            }
        }
    }
}