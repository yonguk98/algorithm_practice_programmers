package 자바기초;

import java.util.Arrays;

public class day20 {
    public static void main(String[] args) {

    }

    public static int[] solution1(int[] arr) {
/*
        int pow = 0;
        for (int i = 1; i <= 10; i++) {
            pow = (int)Math.pow(2,i);
            if(arr.length==pow){
                return arr;
            }
            if(arr.length < pow){
                int[] ans = new int[pow];
                Arrays.fill(ans,0);
                ans = Arrays.copyOf(arr,pow);
                return ans;
            }
        }
       return arr;
*/
        int len = 1;
        while(arr.length >= len){
            len *=2;
        }
        return Arrays.copyOf(arr,len);
    }
    public int solution2(int[] arr1, int[] arr2) {
        if(arr1.length != arr2.length){
            return arr1.length > arr2.length? 1 : -1;
        }
        int sum1 = Arrays.stream(arr1).sum();
        int sum2 = Arrays.stream(arr2).sum();
//        return sum1 > sum2 ? 1 : sum1==sum2 ? 0 : -1;
        return Integer.compare(sum1,sum2);
    }
    public int solution3(String[] strArr) {
        int[] arr = new int[30 + 1];

        for (String s : strArr) {
            arr[s.length()]++;
        }
        return Arrays.stream(arr).max().getAsInt();
    }
    public int[] solution4(int[] arr, int n) {
        int state = 0;
        if (arr.length % 2 == 0) {
            state = 1;
        }
/*
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == state) {
                arr[i] += n;
            }
        }
*/
        for (int i = state; i < arr.length; i+=2) {
            arr[i]+=n;
        }
        return arr;
    }
    public int[] solution5(int[] num_list) {
        return Arrays.copyOfRange(Arrays.stream(num_list).sorted().toArray(),0,5);
    }
}
