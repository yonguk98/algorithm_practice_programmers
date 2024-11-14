import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = {};

        List<Integer[]> list = new ArrayList<>();
        for (int i = 1; i <= yellow; i++){
            if(yellow % i == 0){
                list.add(new Integer[]{yellow/i,i});
            }

            if(yellow/i <= i){
                break;
            }

        }

        for(Integer[] i : list){
            if(i[0]*2 + i[1]*2 + 4 == brown){
                answer = new int[]{i[0]+2, i[1]+2};
                break;
            }
        }
        return answer;
    }
}