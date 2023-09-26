package 자바기초;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class day17 {
    public static void main(String[] args) {

    }
    public String solution1(String myString, String pat) {
        return myString.substring(0,myString.lastIndexOf(pat)+pat.length());
    }

    public int solution2(String myString, String pat) {
        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            String sub = myString.substring(i);
            if(sub.startsWith(pat)){
                count++;
            }
        }
        return count;
    }

    public String[] solution3(String[] strArr) {
        List<String> li = new ArrayList<>();
        for (String s : strArr) {
            if(!s.contains("ad")){
                li.add(s);
            }
        }
        return li.toArray(new String[0]);
    }
    public String[] solution5(String my_string) {
//        return Arrays.stream(my_string.split(" "))
//                .filter(x-> !x.isBlank())
//                .collect(Collectors.toList())
//                .toArray(new String[0]);
        return my_string.trim().split("[ ]+");
    }

}
