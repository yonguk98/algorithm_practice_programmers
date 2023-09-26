package 자바기초;

import java.util.ArrayList;
import java.util.List;

public class day7 {
    public static void main(String[] args) {

    }

    public static int[] solution1(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            for (int i = query[0]; i <= query[1] ; i++) {
                if(i%query[2]==0){
                    arr[i] +=1;
                }
            }
        }
        return arr;
    }
    public static int[] solution2(int l, int r) {
        List<Integer> li = new ArrayList<>();
        if(l%5!=0){
            l=l+(5 - l%5);
        }
        for (int i = l; i <= r; i+=5) {
            String num = Integer.toString(i);
            System.out.println("num = " + num);
            boolean flag = true;
            for (int j = 0; j < num.length(); j++) {
                String s = num.substring(j,j+1);
                if(s.equals("0")||s.equals("5")){
                    continue;
                }else {
                    flag=false;
                    break;
                }
            }
            if(flag){
                li.add(Integer.parseInt(num));
            }
        }
        if(li.isEmpty()){
            li.add(-1);
        }
        int[] answer = li.stream().mapToInt(i->i).toArray();
        return answer;
    }

    public int[] solution3(int start_num, int end_num) {
        int[] answer = new int[end_num-start_num+1];
        for (int i = 0; i <= end_num - start_num; i++) {
            answer[i] = i + start_num;
        }
        return answer;
    }

    public int[] solution4(int n) {
        List<Integer> li = new ArrayList<>();
        li.add(n);
        while (n != 1) {
            if (n % 2 == 0) {
                n /= 2;
            } else {
                n = n * 3 + 1;
//            }
                li.add(n);
            }
        }
        return li.stream().mapToInt(i -> i).toArray();
    }


    public static int[] solution5(int[] arr) {
        int i = 0;
        List<Integer> stk = new ArrayList<>();
        while(i < arr.length){
            if(stk.isEmpty()){
                stk.add(arr[i]);
                i+=1;
            }else{
                if(stk.get(stk.size()-1) < arr[i]){
                    stk.add(arr[i]);
                    i++;
                }else{
                    stk.remove(stk.size()-1);
                }
            }
        }

        return stk.stream().mapToInt(x->x).toArray();
    }
}
