package 자바기초;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class day12 {
    public static void main(String[] args) {

    }

    public static int[] solution1(int n, int[] slicer, int[] num_list) {
        switch (n){
            case 1:
                return loop(num_list,0,slicer[1]+1,1);
            case 2:
                return loop(num_list,slicer[0],num_list.length,1);
            case 3:
                return loop(num_list,slicer[0],slicer[1]+1,1);
            case 4:
                return loop(num_list,slicer[0],slicer[1]+1,slicer[2]);
        }
        return new int[0];
    }

    public static int[] loop(int[] num_list, int start, int end, int iter){
        List<Integer> li = new ArrayList<>();
        for (int i = start; i < end; i+=iter) {
            li.add(num_list[i]);
        }
        return li.stream().mapToInt(x->x).toArray();
    }


    public int solution2(int[] num_list) {
        for (int i = 0; i < num_list.length; i++) {
            if(num_list[i]<0){
                return i;
            }
        }
        return -1;
    }

    public int[] solution3(int[] arr, int[][] intervals) {
        int[] a1 = Arrays.copyOfRange(arr,intervals[0][0],intervals[0][1]+1);
        int[] a2 = Arrays.copyOfRange(arr,intervals[1][0],intervals[1][1]+1);
        int[] answer = new int[a1.length+a2.length];
        System.arraycopy(a1,0,answer,0,a1.length);
        System.arraycopy(a2,0,answer,a1.length,a2.length);
        return answer;
    }

    public int[] solution4(int[] arr) {
        int first = -1;
        int last = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 2){first=i;break;};
        }
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i] == 2){last=i;break;}
        }
        return first==-1&&last==-1? new int[]{-1} : Arrays.copyOfRange(arr,first,last+1);
    }

    public int[] solution5(int[] arr, int[] query) {
        int[] answer = Arrays.copyOf(arr,arr.length);
        int start = 0;
        int end = arr.length-1;
        for (int i = 0; i < query.length; i++) {
            if(i%2==0){
//                answer = Arrays.copyOfRange(answer,0,query[i]+1);
                  end = start + query[i];
            }else{
//                answer = Arrays.copyOfRange(answer,query[i],answer.length);
                  start += query[i];
            }
        }
        return Arrays.copyOfRange(arr,start,end+1);
    }
}
