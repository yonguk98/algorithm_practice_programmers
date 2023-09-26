package codingtestpractice.LV1;

import java.util.*;

public class keyboard {
    public static void main(String[] args) {
        String[] keymap = {"ABACD", "BCEFD"};
        String[] target = {"ABCD","AABB"};
        System.out.println(Arrays.toString(solution(keymap,target)));

    }
    public static int[] solution(String[] keymap, String[] targets) {
        int[] answer = new int[targets.length];
        HashMap<Character,Integer> map = new HashMap<>();

        for (String s : keymap) {
            for (char c : s.toCharArray()) {
                if(map.containsKey(c)){
                    if(s.indexOf(c)!=-1 && s.indexOf(c)+1 < map.get(c)){map.replace(c,s.indexOf(c)+1);}
                }else{map.put(c,s.indexOf(c)+1);}
            }
        }
        int j = 0;
        for (String target : targets) {
            int sum = 0;
            for (int i = 0; i < target.length(); i++) {
                Integer temp = map.get(target.charAt(i));
                if(temp == null){sum=-1;break;}
                sum+= temp;
            }
            answer[j] = sum;
            j++;
        }
        return answer;
    }
}
