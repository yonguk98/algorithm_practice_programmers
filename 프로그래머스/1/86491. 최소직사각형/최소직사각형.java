class Solution {
    public int solution(int[][] sizes) {
        // h가 w 보다 크면 자리 바꾸기
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][1] > sizes[i][0]) {
                    int temp = sizes[i][0];
                    sizes[i][0] = sizes[i][1];
                    sizes[i][1] = temp;
            }
        }

        // w,h 각각의 최대값 구하기
        int maxW = sizes[0][0];
        int maxH = sizes[0][1];
        for (int i = 0; i < sizes.length; i++) {
            if (maxW < sizes[i][0]) {
                maxW = sizes[i][0];
            }

            if (maxH < sizes[i][1]) {
                maxH = sizes[i][1];
            }
        }
        return maxW * maxH;
    }
}