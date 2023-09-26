package 자바기초;

import java.util.*;

public class day8 {
    public static void main(String[] args) {
        System.out.println(solution2(2,5,2,6));
    }


    public boolean solution1(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1||x2)&&(x3||x4);
    }

    public static int solution2(int a, int b, int c, int d) {
        Integer[] arr = {a,b,c,d};

        Map<Integer,Integer> map = new HashMap<>();
        for (Integer i : arr) {
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        List<Integer> keySet = new ArrayList<>(map.keySet());
        keySet.sort((o1, o2) -> map.get(o2).compareTo(map.get(o1)));
        System.out.println("keySet = " + keySet);
        int answer = 0;
        switch (map.get(keySet.get(0))){
            case 4:
                answer = 1111 * keySet.get(0);
                break;
            case 3:
                answer = (int) Math.pow((keySet.get(0)*10 + keySet.get(1)),2);
                break;
            case 2:
                if(map.get(keySet.get(1))==2){
                    answer = (keySet.get(0) + keySet.get(1))*Math.abs((keySet.get(0)-keySet.get(1)));
                }else{
                    answer = keySet.get(1) *keySet.get(2);
                }
                break;
            case 1:
                List<Integer> sortedArr = Arrays.asList(arr);
                Collections.sort(sortedArr);
                answer = sortedArr.get(0);
                break;
        }

        return answer;
    }

    public String solution3(String my_string, int[] index_list) {
        String answer = "";
        for (int i : index_list) {
            answer += my_string.charAt(i);
        }
        return answer;
    }
    public int solution4(String number) {
        int sum = 0;
        for (int i = 0; i < number.length(); i++) {
            sum += Integer.parseInt(String.valueOf(number.charAt(i)));
        }
        return sum%=9;

//        return number.chars().map(x-> x-'0').sum() % 9;
    }

    public String solution5(String my_string, int[][] queries) {
        for (int[] query : queries) {
//            String before = my_string.substring(query[0],query[1]);
//            String after = "";
//            for (int i = query[1]; i >= query[0]; i--) {
//                after += my_string.charAt(i);
//            }
//            my_string = my_string.substring(0,query[0]) + after + my_string.substring(query[1]+1);
            my_string = my_string.substring(0,query[0])
                        + new StringBuilder(my_string.substring(query[0],query[1]+1)).reverse().toString()
                        + my_string.substring(query[1]+1);
        }

        return my_string;
    }

}
