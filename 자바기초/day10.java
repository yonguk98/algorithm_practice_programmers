package 자바기초;

public class day10 {
    public static void main(String[] args) {

    }

    public String solution1(String my_string, int n) {
        return my_string.substring(0,n);
    }

    public int solution2(String my_string, String is_prefix) {
        if(my_string.charAt(0) != is_prefix.charAt(0)){
            return 0;
        }
        for (int i = 0; i < my_string.length(); i++) {
            if(my_string.substring(0,i+1).equals(is_prefix)){
                return 1;
            }
        }
        return 0;
    }

    public String solution3(String my_string, int s, int e) {
        return my_string.substring(0,s)
                + new StringBuffer(my_string.substring(s,e+1))
                .reverse().toString()
                + my_string.substring(e+1);
    }

    public String solution4(String my_string, int m, int c) {
        StringBuffer sb = new StringBuffer();
        for (int i = c-1; i < my_string.length(); i+=m) {
            sb.append(my_string.charAt(i));
        }
        return sb.toString();
    }

    public String solution4(int q, int r, String code) {
        String answer = "";
        for (int i = r; i < code.length(); i+=q) {
            answer+=code.charAt(i);
        }
        return answer;
    }
}
