package 자바기초;

import java.util.Arrays;
import java.util.Collections;

public class day15 {
    public static void main(String[] args) {

    }

    public int[] solution1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] >=50 && arr[i]%2==0){
                arr[i]/=2;
            }else if(arr[i]<50 && arr[i]%2 !=0){
                arr[i]*=2;
            }
        }
        return arr;
    }

    public int solution2(int[] arr1) {
        int[] arr2 = {-1};
        int count = 0;
        while(!check(arr1,arr2)){
            count++;
            arr2 = Arrays.copyOf(arr1, arr1.length);
            task(arr1);
        }
        return count-1;
    }
    public static int[] task(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>=50 && arr[i]%2==0){
                arr[i] /=2;
            }else if(arr[i] < 50 && arr[i]%2!=0){
                arr[i] = arr[i]*2 + 1;
            }
        }
        return arr;
    }
    public static boolean check(int[] arr1, int[]arr2){
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }

    public int solution3(int[] num_list) {
        int count =0;
        for (int i : num_list) {
            if(i==1){
                continue;
            }
            while (i!=1){
                if(i%2==0){
                    i/=2;
                }else{
                    i = (--i)/2;
                }
                count++;
            }
        }
        return count;
    }

    public int solution4(int[] num_list) {
        if(num_list.length >=11){
            return Arrays.stream(num_list).sum();
        }else{
            int answer = 1;
            for (int i : num_list) {
                answer*=i;
            }
            return answer;
        }
    }
    public int solution5(String myString, String pat) {
        return myString.toLowerCase().contains(pat.toLowerCase())?1:0;
    }
}
