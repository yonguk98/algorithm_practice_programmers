package 자바기초;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class day9 {
    public static void main(String[] args) {

    }

    public int[] solution1(String[] intStrs, int k, int s, int l) {
        List<Integer> answer = new ArrayList<>();
        for (String intStr : intStrs) {
            int temp = Integer.parseInt(intStr.substring(s,s+l));
            if(temp > k){
                answer.add(temp);
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }

    public String solution2(String[] my_strings, int[][] parts) {
        String answer = "";
        for (int i = 0; i < parts.length; i++) {
            answer += my_strings[i].substring(parts[i][0],parts[i][1]+1);
        }
        return answer;
    }

    public String solution3(String my_string, int n) {
        return new String(my_string.substring(my_string.length()-n,my_string.length()));
    }

    public String[] solution4(String my_string) {
        List<String> li = new ArrayList<>();
        for (int i = my_string.length()-1; i >= 0; i--) {
            li.add(my_string.substring(i,my_string.length()));
        }
        return li.stream().sorted().toArray(String[]::new);
    }
    public int solution5(String my_string, String is_suffix) {
//        for (int i = 0; i < my_string.length(); i++) {
//            if(my_string.substring(i,my_string.length()).equals(is_suffix)){
//                return 1;
//            }
//        }
//        return 0;
        return my_string.endsWith(is_suffix)?1:0;
    }
}
