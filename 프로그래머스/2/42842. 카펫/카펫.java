import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        for (int i = 1; i <= yellow; i++){
            if(yellow % i == 0){
                if((yellow/i + i) * 2 + 4 == brown){
                    answer = new int[]{yellow/i + 2,i + 2};
                    break;
                }
            }

        }
        return answer;
    }
}