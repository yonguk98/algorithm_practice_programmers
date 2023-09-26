package codingtestkit.hash;

import java.util.HashMap;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "ana", "mislav" };
        System.out.println(solution(participant, completion));
    }

    public static String solution(String[] participant, String[] completion) {
        HashMap<String, Integer> runner = new HashMap<String, Integer>();

        for (String p : participant) {
            if (!runner.containsKey(p)) {
                runner.put(p, 1);
            } else {
                runner.replace(p, runner.get(p) + 1);
            }
        }

        for (String c : completion) {
            if (runner.containsKey(c)) {
                runner.replace(c, runner.get(c) - 1);
            }
        }
        String ans = "";
        for (String key : runner.keySet()) {
            if (runner.get(key) == 1) {
                ans = key;
            }
        }
        return ans;
    }

}
