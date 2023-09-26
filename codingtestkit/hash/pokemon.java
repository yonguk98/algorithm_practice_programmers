package codingtestkit.hash;

import java.util.HashMap;

public class pokemon {

    public static void main(String[] args) {
        int[] nums = { 3, 3, 3, 2, 2, 4 };

        System.out.println(solution(nums));
    }

    public static int solution(int[] nums) {
        HashMap<Integer, Integer> pokemonHashMap = new HashMap<Integer, Integer>();

        for (int i : nums) {
            if (pokemonHashMap.containsKey(i)) {
                continue;
            } else {
                pokemonHashMap.put(i, 1);
            }
        }
        return Integer.min(pokemonHashMap.size(), nums.length / 2);
    }
}