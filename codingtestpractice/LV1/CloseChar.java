package codingtestpractice.LV1;

import java.util.ArrayList;
import java.util.List;

public class CloseChar {
    public static void main(String[] args) {

    }
    public static int[] solution(String s){
        StringBuilder sb = new StringBuilder();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            String thisChar = String.valueOf(s.charAt(i));
            if(sb.toString().contains(thisChar)){
                answer.add(i-sb.lastIndexOf(thisChar));
            }else{
                answer.add(-1);
            }
            sb.append(thisChar);
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}
