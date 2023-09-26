package codingtestkit.hash;

import java.util.HashMap;

public class 전화번호목록 {
    public static void main(String[] args) {
        String[] a = { "119", "97674223", "1195524421" };
        System.out.println(solution(a));
    }

    public static boolean solution(String[] phone_book) {
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
