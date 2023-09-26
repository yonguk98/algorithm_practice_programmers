package codingtestkit.hash;

import java.util.HashMap;

class 의상 {

    public static void main(String[] args) {

    }

    public static int solution(String[][] clothes) {
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
            answer *= (map.get(s) + 1);// 의상의 갯수 + 그 의상을 선택하지 않는 경우의 수
        }
        return answer - 1; // 모든 의상을 선택하지 않는 경우의 수 빼기
    }
}