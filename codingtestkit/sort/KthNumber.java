package codingtestkit.sort;

import java.util.Arrays;

public class KthNumber {
    public static void main(String[] args) {
        solution(new int[]{1, 5, 2, 6, 3, 7, 4},new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}});
    }

    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for (int i = 0; i < commands.length; i++) {
            int[] sliced = Arrays.copyOfRange(array,commands[i][0]-1,commands[i][1]);
            sliced = Arrays.stream(sliced).sorted().toArray();
            answer[i] = sliced[commands[i][2]-1];
        }
        System.out.println("answer = " + Arrays.toString(answer));
        return answer;
    }
}
