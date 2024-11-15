class Solution {
    static int[] Numbers;
    static int Target;
    static int answer = 0;
    
    public int solution(int[] numbers, int target) {
        Numbers = numbers;
        Target = target;

        dfs(0,numbers.length,0);

        return answer;
    }
    
    public static void dfs(int r, int n, int sum){
        if(r==n){
            if(sum==Target) answer+=1;
            return;
        }

        dfs(r+1,n,sum+Numbers[r]);
        dfs(r+1,n,sum-Numbers[r]);
    }
}