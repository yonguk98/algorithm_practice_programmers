import java.util.HashMap;
class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        for (String num : phone_book)
            map.put(num, null);

        for (String key : phone_book) {
            for (int i = 0; i < key.length(); i++) {
                if (map.containsKey(key.substring(0, i)))
                    return false;
            }
        }
        return true;
    }
}