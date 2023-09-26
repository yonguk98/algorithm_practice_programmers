package kakao2019;

import java.util.Arrays;
import java.util.LinkedList;

public class tree {

    public static void main(String[] args) {
        int[][] arr = {{5, 3},{11,5},{13,3},{3,5},{6,1},{1,3},{8,6},{7,2},{2,2}};
        solution(arr);
    }
    public static int[][] solution(int[][] nodeinfo) {
        LinkedList<Integer[]> l = new LinkedList<>();
        Arrays.sort(nodeinfo, (a,b)->{ return b[1]-a[1];}); // y좌표 내림차순으로 정렬

        for (int i = 0; i < nodeinfo.length-1; i++) {

        }

        for (int[] ints : nodeinfo) {

        }

        int[][] answer = {};
        return answer;
    }

}
