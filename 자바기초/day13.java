package 자바기초;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class day13 {
    public static void main(String[] args) {

    }

    public int[] solution1(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,n,num_list.length);
    }

    public int[] solution2(int[] num_list, int n) {
        List<Integer> li = IntStream.of(Arrays.copyOfRange(num_list,n,num_list.length)).boxed().collect(Collectors.toList());
        for (int i = 0; i < n; i++) {
            li.add(num_list[i]);
        }
        return li.stream().mapToInt(x->x).toArray();
    }

    public String[] solution3(String[] str_list) {
        for (int i = 0; i < str_list.length; i++) {
            if(str_list[i].equals("l")){
                return Arrays.copyOfRange(str_list,0,i);
            }
            if(str_list[i].equals("r")){
                return Arrays.copyOfRange(str_list,i,str_list.length);
            }
        }
        return new String[]{};
    }

    public int[] solution4(int[] num_list, int n) {
        return Arrays.copyOfRange(num_list,0,n);
    }
    public int[] solution5(int[] num_list, int n) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < num_list.length; i+=n) {
            answer.add(num_list[i]);
        }

        return answer.stream().mapToInt(x->x).toArray();
    }
}
