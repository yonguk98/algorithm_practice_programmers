package 자바기초;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class day19 {
    public static void main(String[] args) {
        solution5(new int[]{0, 1, 1, 1, 1},4);
    }
    public String[] solution1(String myStr) {
        return myStr.split("a|b|c",0).length==0?
                new String[]{"EMPTY"}
                :Arrays.stream(myStr.split("a|b|c",0))
                .filter(x-> !x.isEmpty())
                .toArray(String[]::new);
    }

    public int[] solution2(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        for (int i : arr) {
            for (int j = 0; j < i; j++) {
                answer.add(i);
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
    public int[] solution3(int[] arr, boolean[] flag) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < flag.length; i++) {
            if(flag[i]){
                for (int j = 0; j < arr[i]*2; j++) {
                    answer.add(arr[i]);
                }
            }else {
                for (int j = 0; j < arr[i]; j++) {
                    answer.remove(answer.size()-1);
                }
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
    public int[] solution4(int[] arr) {
        List<Integer> answer = new ArrayList<>();
//        int i = 0;
//        while(i<arr.length){
//            int size = answer.size();
//            if(size==0){
//                answer.add(arr[i]);
//            } else if (answer.get(size-1)==arr[i]) {
//                answer.remove(size-1);
//            } else {
//                answer.add(arr[i]);
//            }
//            i++;
//        }
        for (int i : arr) {
            if(!answer.isEmpty()&& answer.get(answer.size()-1)==i){
                answer.remove(answer.size()-1);
            }else{
                answer.add(i);
            }
        }
        return answer.size()==0?new int[]{-1}:answer.stream().mapToInt(x->x).toArray();
    }
    public static int[] solution5(int[] arr, int k) {
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(!answer.contains(arr[i])){
                answer.add(arr[i]);
            }
            if(answer.size() == k){
                return answer.stream().mapToInt(x->x).toArray();
            }
        }

        if(answer.size()<k){
            int size = answer.size();
            for (int i = 0; i < k - size; i++) {
                answer.add(-1);
            }
        }
        return answer.stream().mapToInt(x->x).toArray();
    }
}
