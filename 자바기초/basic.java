package 자바기초;

public class basic {
    public static void main(String[] args) {

    }

    public static int solution1(String str1, String str2) {

        return str2.contains(str1)? 1:0;
    }


    public int solution2(int number, int n, int m) {
        return (number%m==0 && number %n==0) ? 1:0;
    }
}
