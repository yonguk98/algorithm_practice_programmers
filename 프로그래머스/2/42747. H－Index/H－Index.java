import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;

        // 배열 형 변환
        Integer[] arr = Arrays.stream(citations).boxed().toArray(Integer[]::new);

        // 정렬
        Arrays.sort(arr, Comparator.reverseOrder());

        // H index 찾기
        answer = arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < i + 1) {
                answer = i;
                break;
            }
        }

        return answer;
    }
}