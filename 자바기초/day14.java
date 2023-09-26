package 자바기초;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day14 {
    public static void main(String[] args) {

    }

    public int solution1(int[] num_list) {
        int sumEven = 0;
        int sumOdd = 0;
        for (int i = 0; i < num_list.length; i++) {
            if(i%2==0){
                sumOdd+=num_list[i];
            }else{
                sumEven+=num_list[i];
            }
        }
        return sumEven>sumOdd?sumEven:sumOdd;
    }

    public String[] solution2(String[] names) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < names.length; i+=5) {
            answer.add(names[i]);
        }
        return answer.toArray(new String[0]);
    }
    public String[] solution3(String[] todo_list, boolean[] finished) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if(!finished[i]){
                answer.add(todo_list[i]);
            }
        }
        return answer.toArray(new String[0]);
    }

    public int solution4(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            if( answer <= n){
                answer+=number;
            }else {
                return answer;
            }
        }
        return answer;
    }
    public int[] solution5(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1]; i++) {
                arr[i] +=1;
            }
        }
        return arr;
    }
}
