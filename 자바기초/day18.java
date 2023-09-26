package 자바기초;

import java.util.*;

public class day18 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution2("xabcdxaaxasdxasdxaefdxaasexxxxx")));
    }

    public static int[] solution1(String myString) {
//        List<String> li = new ArrayList<>(Arrays.asList(myString.split("x")));
//        if(myString.charAt(myString.length()-1)=='x'){
//            li.add("");
//        }
//        int[] answer = li.stream().mapToInt(x->x.length()).toArray();

        int[] answer = Arrays.stream(myString.split("x", -1)).mapToInt(x->x.length()).toArray();
        return answer;
    }
    public static String[] solution2(String myString) {
        return Arrays.stream(myString.split("x", 0))
                .filter(x-> !x.equals(""))
                .sorted().toArray(String[]::new);
    }
    public int solution3(String binomial) {
        String[] arr = binomial.split(" ");
        int op1 = Integer.parseInt(arr[0]);
        int op2 = Integer.parseInt(arr[2]);
        switch (arr[1]){
            case "+": return op1+op2;
            case "-": return op1-op2;
            case "*": return op1*op2;
            case "/": return op1/op2;
        }
        return 0;
    }

    public int solution4(String myString, String pat) {
        StringBuilder sb = new StringBuilder(myString);
        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i)=='A'){
                sb.setCharAt(i,'B');
            }else if(sb.charAt(i)=='B'){
                sb.setCharAt(i,'A');
            }
        }
        if(sb.toString().contains(pat)){
            return 1;
        }
        return 0;
    }
    public String solution5(String rny_string) {
        return rny_string.replaceAll("m","rn");
    }
}
