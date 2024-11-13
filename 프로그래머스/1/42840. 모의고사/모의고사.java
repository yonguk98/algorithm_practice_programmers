import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class Solution {
    public int[] solution(int[] answers) {
        int[] counts = new int[3];

        int[] s1 = {1,2,3,4,5};
        int[] s2 = {2,1,2,3,2,4,2,5};
        int[] s3 = {3,3,1,1,2,2,4,4,5,5};

        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == s1[ i % s1.length]) {
                counts[0]+=1;
            }
            if (answers[i] == s2[ i % s2.length]) {
                counts[1]+=1;
            }
            if (answers[i] == s3[ i % s3.length]) {
                counts[2]+=1;
            }
        }
        int maxCount = Arrays.stream(counts).max().getAsInt();
        
        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if(counts[i] == maxCount){
                answer.add(i+1);
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}