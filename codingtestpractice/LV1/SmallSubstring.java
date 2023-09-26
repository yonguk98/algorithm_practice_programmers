package codingtestpractice.LV1;

public class SmallSubstring {
    public static void main(String[] args) {
        System.out.println(solution("1020300","15"));
    }
    public static int solution(String t, String p) {
        long intP = Long.parseLong(p);
        int count = 0;
        for (int i = 0; i <= t.length()-p.length(); i++) {
            long sub = Long.parseLong(t.substring(i,i+ p.length()));
            if(sub <= intP){
                count++;
            }
        }
        return count;
    }
}
