package kakao2022;

import java.util.*;

public class report {
    public static void main(String[] args) {

    }
    public static boolean find(String[] input, String target){
        return Arrays.asList(input).contains(target);
    }

    public static String[] addToArray(String[] input, String target){
        List<String> inputToList =new ArrayList<>(Arrays.asList(input));
        inputToList.add(target);
        String[] output= {};
        return inputToList.toArray(output);
    }

    public static int[] solution(String[] id_list, String[] report, int k) {
        HashMap<String, String[]> reportMap = new HashMap<>();
        HashMap<String, String[]> reportedMap = new HashMap<>();

        for (String s : id_list) {
            reportMap.putIfAbsent(s,new String[]{});
            reportedMap.putIfAbsent(s,new String[]{});
        }
        for (String s : report) {
            String a = s.substring(0,s.indexOf(" "));
            String b = s.substring(s.indexOf(" ")+1);
            if(!find(reportMap.get(a),b)){ // a가 b를 신고한 적이 없으면
                reportMap.replace(a,addToArray(reportMap.get(a),b)); // a의 신고 목록에 추가
                reportedMap.replace(b,addToArray(reportedMap.get(b),a));// b의 신고당한 목록에 추가
            } //신고한 적이 있으면 아무것도 안함
        }
        //신고당한 횟수가 k보다 크면 알림 보내기
        int[] answer = new int[id_list.length];
        int idx = 0;
        for (String s : id_list) {
            int count = 0;
            for (String key : reportedMap.keySet()) {
                if(reportedMap.get(key).length>=k&&find(reportedMap.get(key),s)){count++;}
            }
            answer[idx] = count;
            idx++;
        }
        return answer;
    }
}
