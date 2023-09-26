package 자바기초;

import java.util.*;

public class day4 {
    public static void main(String[] args) {
        solution5(new int[]{0, 1, 2, 4, 3},new int[][]{{0, 4, 2},{0, 3, 2},{0, 2, 2}});
    }

    public int[] solution1(int[] num_list) {
        int lastIndex = num_list.length-1;
        int lastElement = 0;
        if(num_list[lastIndex] > num_list[lastIndex-1]){
            lastElement = num_list[lastIndex] - num_list[lastIndex-1];
        }else {
            lastElement = num_list[lastIndex] * 2;
        }
        int[] arr = new int[lastIndex+2];
        System.arraycopy(num_list,0,arr,0,num_list.length);
        arr[arr.length-1] = lastElement;
        return arr;
    }

    public int solution2(int n, String control) {
        int answer = n;
        char[] arr = control.toCharArray();
        for (char c : arr) {
            switch (c){
                case 'w': answer +=1; break;
                case 'a': answer -=10; break;
                case 's': answer -=1; break;
                case 'd': answer +=10; break;
            }
        }
        return answer;
    }

    public String solution3(int[] numLog) {
        List<String> li = new ArrayList<>();
        int n = numLog[0];
        for (int i = 1; i < numLog.length; i++) {
            if(numLog[i] == n+1 ){
                li.add("w");
            } else if (numLog[i] == n-1) {
                li.add("s");
            } else if (numLog[i] == n+10) {
                li.add("d");
            }else {
                li.add("a");
            }
            n = numLog[i];
        }
        String answer = "";
        for (String s : li) {
            answer+=s;
        }
        return answer;
    }

    public int[] solution4(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        return arr;
    }

    public static int[] solution5(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        int count = 0;
        for (int[] query : queries) {
            List<Integer> li = new ArrayList<>();
            for (int i = query[0]; i <= query[1]; i++) {
                if(arr[i] > query[2]){
                    li.add(arr[i]);
                }
            }
            if(li.isEmpty()){
                li.add(-1);
            }
            answer[count] = Collections.min(li);
            count++;
        }
        return answer;
    }
}
