package codingtestpractice.LV1;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
    public static void main(String[] args) {
        System.out.println(solution(new String[]{"a", "b", "c"}, new String[]{"d", "e"}, new String[]{"d", "a","b","c"}));
    }

    public static String solution(String[] cards1, String[] cards2, String[] goal) {
        List<String> li = new ArrayList<>();
        int i = 0;
        int j = 0;
        for (int k = 0; k < goal.length; k++) {
            if(i < cards1.length){
                li.add(cards1[i]);
                if(compare(li,goal)){
                    i++;
                    continue;
                }
                li.remove(li.size()-1);
            }
            if(j < cards2.length){
                li.add(cards2[j]);
                if(compare(li,goal)){
                    j++;
                    continue;
                }
                li.remove(li.size()-1);
            }
            return "No";
        }
        return "Yes";
    }
    public static boolean compare(List<String> li, String[] goal){
        for (int i = 0; i < li.size(); i++) {
            if(!goal[i].equals(li.get(i))){
                return false;
            }
        }
        return true;
    }

    public static String solution2(String[] cards1, String[] cards2, String[] goal){
        int card1Idx = 0;
        int card2Idx = 0;
        for (int i = 0; i < goal.length; i++) {
            if(card1Idx < cards1.length && goal[i].equals(cards1[card1Idx])){
                card1Idx++;
            }
            else if(card2Idx < cards2.length && goal[i].equals(cards2[card2Idx])){
                card2Idx++;
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }
}
