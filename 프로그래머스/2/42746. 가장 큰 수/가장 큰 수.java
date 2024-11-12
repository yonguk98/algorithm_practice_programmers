import java.util.Arrays;
class Solution {
    public String solution(int[] numbers) {
        // 예외처리, 모두 0인 경우
        if (Arrays.stream(numbers).max().getAsInt() == 0) {
            return "0";
        }
        // 문자로 변환
        String[] numArray = Arrays.stream(numbers)
                .mapToObj(String::valueOf)
                .toArray(String[]::new);

        // 정렬
        Arrays.sort(numArray, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        
        return String.join("",numArray);
    }
}