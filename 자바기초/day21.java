package 자바기초;

import java.util.*;

public class day21 {
    public static void main(String[] args) {
        System.out.println(solution2(new int[]{1,2,3},new boolean[]{true,true,true}));
    }
    public int[] solution1(int[] num_list) {
        Arrays.sort(num_list);
        return Arrays.copyOfRange(num_list,5,num_list.length);
    }

    public static int solution2(int[] rank, boolean[] attendance) {
//        List<Integer> li = new ArrayList<>();
//        int i = 1;
//        while(li.size()<3){
//            for (int j = 0; j < rank.length; j++) {
//                if(rank[j]==i&&attendance[j]==true){
//                    li.add(j);
//                    break;
//                }
//            }
//            i++;
//        }
//        return li.get(0)*10000 + li.get(1)*100 + li.get(2);

        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < attendance.length; i++) {
            if(attendance[i]){
                map.putIfAbsent(rank[i],i);
            }
        }
        int[] arr = map.keySet().stream().sorted().mapToInt(x->x).toArray();
        return map.get(arr[0])*10000 + map.get(arr[1])*100 + map.get(arr[2]);
    }

    public int solution3(double flo) {
        return (int) flo;
    }
    public int solution(String num_str) {
        int sum = 0;
        for (int i = 0; i < num_str.length(); i++) {
            sum+= Integer.parseInt(num_str.substring(i,i+1));
        }
        return sum;
    }
}
