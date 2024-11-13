class Solution {
    public int solution(int[][] sizes) {
        int maxW = 0;
        int maxH = 0;
        for (int[] card : sizes){
            maxW = Math.max(maxW, Math.max(card[0],card[1])); 
            maxH = Math.max(maxH, Math.min(card[0],card[1]));
        }
        
        return maxW * maxH;
    }
}