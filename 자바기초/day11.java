package 자바기초;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class day11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution4(10,3)));
    }

    public int[] solution1(String my_string) {
        int[] answer = new int[52];
        Arrays.fill(answer,0);
        for (int i = 0; i < my_string.length(); i++) {
            int sub = my_string.charAt(i) - 'A';
            if(sub <= 25){
                answer[sub]++;
            }else{
                answer[sub - 6]++;
            }
        }
        return answer;
    }

    public int[] solution2(int n, int k) {
        List<Integer> li = new ArrayList<>();
        for (int i = k; i <= n; i+=k) {
            if(i <= n){li.add(i);}
            else{break;}
        }
        return li.stream().mapToInt(x->x).toArray();
    }
    public String solution3(String my_string, int[] indices) {
//        char[] c = my_string.toCharArray();
//        for (int index : indices) {
//            c[index] = '0';
//        }
        StringBuilder sb = new StringBuilder(my_string);
        for (int index : indices) {
            sb.setCharAt(index,' ');
        }
        return sb.toString().replace(" ","");
    }

    public static int[] solution4(int start, int end_num) {
        int[] arr = new int[start-end_num+1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = start-i;
        }
        return arr;
    }

    public int solution5(int[] arr, int idx) {
        for (int i = idx; i < arr.length; i++) {
            if(arr[i]==1){
                return i;
            }
        }
        return -1;
    }
}
