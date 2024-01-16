import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        int n = clothes.length;
        HashMap<String, Integer> map = new HashMap<>();

        String key;
        for (int i = 0; i < n; i++) {
            key = clothes[i][1];
            if (map.containsKey(key)) {
                map.replace(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }

        for (String s : map.keySet()) {
            answer *= (map.get(s) + 1);
        }
        return answer - 1;
    }
}