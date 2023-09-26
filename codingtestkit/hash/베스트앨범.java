package codingtestkit.hash;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class 베스트앨범 {
    public static void main(String[] args) {
        
    }

    public static int[] solution(String[] genres, int[] plays) {
        /* 장르별 총 재생횟수
         * 노래별 고유번호,재생횟수,장르
         * 
         * 장르별 선택된 노래 고유번호 계산
         */
        
         // 장르별 총 재생횟수 해쉬맵
        Map<String, Integer> map = new HashMap<>();
        Map<String, ArrayList<Music>> map2 = new HashMap<>();
        ArrayList<Music> m = new ArrayList<>();

        for(int i = 0; i < genres.length; i++){
            if(map.containsKey(genres[i])){
                map.put(genres[i], map.get(genres[i])+plays[i]);
            }else{
                map.put(genres[i], plays[i]);
                // map2.put(genres[i],new Music(i,genres[i],plays[i]));
            }
        }

        // 재생횟수 내림차순 정렬

        // 

        int[] answer = {};
        return answer;
    }
    static class Music{
        public int count;
        public String gen;
        public int id;

        public Music(int id, String gen, int count){
            this.count = count;
            this.gen = gen;
            this.id = id;
        }

        public int getCount(){return count;}
        public int getId(){return id;}
        public String getGenre(){return gen;}
        
        // public void setCount(int count){this.count = count;}
    }
}
    