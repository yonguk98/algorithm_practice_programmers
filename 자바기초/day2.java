package 자바기초;

import java.util.Scanner;

public class day2 {
    public static void main(String[] args) {
//        solution1("hahahahahahahahha", "youretoslow", 4);
//        solution2("aaa","bbb");
//        solution3(new String[]{"a","b","c"});
//        solution4("love",4);
        solution5(91,9);
    }

    public static void p1(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();

        System.out.println(a+b);
    }

    public static void p2(){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();

        for (char o : a.toCharArray()) {
            System.out.println(o);
        }
    }

    public static void p3(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n%2 == 0){
            System.out.println(n + " is even");
        }else {System.out.println(n + " is odd");}
    }

    public static String solution1(String my_string, String overwrite_string, int s) {
        String answer = my_string.substring(0,s) + overwrite_string + my_string.substring(s+overwrite_string.length());
        return answer;
    }
    public static String solution2(String str1, String str2) {
        String answer = "";

        for(int i = 0; i < str1.length(); i++){
            answer += str1.substring(i,i+1) + str2.substring(i,i+1);
//            answer += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
//            answer+= str1.charAt(i) + str2.charAt(i);
        }

        System.out.println("answer = " + answer);
        return answer;
    }
    public static String solution3(String[] arr) {
        String answer = "";
        for (String a : arr) {answer += a;}
        System.out.println("answer = " + answer);
        return answer;
    }
    public static String solution4(String my_string, int k) {
        String answer = "";

//        for (int i = 0; i < k; i++) {answer+= my_string;}

        System.out.println("answer = " + my_string.repeat(k));
        return my_string.repeat(k);
    }
    public static int solution5(int a, int b) {

        Integer ab = Integer.parseInt(String.valueOf(a) + String.valueOf(b));
        Integer ba = Integer.parseInt(String.valueOf(b) + String.valueOf(a));

        return ab >= ba? ab : ba;
    }

    public static int solution6(int a, int b) {
        int answer = 0;
        Integer ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));

        return ab >= 2*a*b?ab:2*a*b;
    }
}
