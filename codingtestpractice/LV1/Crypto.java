package codingtestpractice.LV1;

import java.util.stream.IntStream;

public class Crypto {
    public static void main(String[] args) {
        System.out.println(solution("aukks","wbqd",5));
    }

    public static String solution(String s, String skip, int index) {
        StringBuffer sb = new StringBuffer(s);
        for (int i = 0; i < s.length(); i++) {
            sb.setCharAt(i,charCompute(skip,s.charAt(i),index));
        }
        return sb.toString();
    }

    public static char charCompute(String skip,int original, int index){
        int[] arr = new int[index];
        int next;
        int count = 0;
        int nextIdx = 1;
        while(count != index) {
            nextIdx %=26; // nextIdx가 skip문자 때문에 26을 넘어가는 경우의 수 제한.
            if(nextIdx+original - 'z' <= 0){
                next = nextIdx+original;
            }else{
                next = nextIdx+original - 26;
            }
            if(skip.contains(String.valueOf((char) next))){
                nextIdx++;
            }
            else {
                arr[count] = next;
                nextIdx++;
                count++;
            }
        }
    return (char) arr[index-1];
    }
}
