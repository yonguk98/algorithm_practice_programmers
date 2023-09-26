package kakao2023;

import org.w3c.dom.CDATASection;

import java.util.*;
import java.util.stream.Collectors;

public class privacy {
    public static void main(String[] args) {
        solution2("2011.12.18",new String[]{"A 13"}, new String[]{"2010.11.28 A","2010.11.28 A","2010.12.01 A"});
    }

    public static int[] solution(String today, String[] terms, String[] privacies) {
        // today to year,month,day
        Integer date = Integer.parseInt(Arrays.stream(today.split("\\.")).collect(Collectors.joining()));
        // term mapping
        Map<String,Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] sp = term.split(" ");
            termMap.put(sp[0],Integer.parseInt(sp[1]));
        }

        List<Integer> expList = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            // expire day calculate
            String type = privacies[i].split(" ")[1];

            String numbers = privacies[i].split(" ")[0];
            String[] regDate = numbers.split("\\.");

            int expYear = Integer.parseInt(regDate[0]);
            int expMonth = Integer.parseInt(regDate[1]);
            int expDay = Integer.parseInt(regDate[2]);
            int expDate = expCalculate(expYear,expMonth,expDay,termMap.get(type));
            System.out.println("expDate = " + expDate);
            // add to list
            if(expDate < date){
                expList.add(i+1);
            }
        }
        return expList.stream().mapToInt(x->x).toArray();
    }
    public static int expCalculate(int Y,int M, int D, int p){
        M += p;
        if(M%12==0){
//            Y += M%12==0?p/12:M/12;
//            M = M%12;
            Y += p/12;
            M = (M-p) + p%12;
        }else if(M > 12){
            Y += M/12;
            M = M%12;
        }
        D -= 1;
        if(D < 1){
            D = 28;
            M -= 1;
            if(M < 1){
                Y -= 1;
                M = 12;
            }
        }
//        int before = Y*12*28 + M*28 + D;
//        int after = before+ p*28;
//
//        Y = (after/28)/12;
//        M = (M+p)%13;
//        D = D-1<1?28:D-1;
//        System.out.println("M = " + M);
        return Integer.parseInt(String.valueOf(Y) + String.format("%02d",M) + String.format("%02d",D));
    }

    public static int[] solution2(String today, String[] terms, String[] privacies) {
        // today to year,month,day
        int[] dates = Arrays.stream(today.split("\\.")).mapToInt(x -> Integer.parseInt(x)).toArray();
        int date = dates[0] * 12 * 28 + dates[1] * 28 + dates[2];
        // term mapping
        Map<String, Integer> termMap = new HashMap<>();
        for (String term : terms) {
            String[] sp = term.split(" ");
            termMap.put(sp[0], Integer.parseInt(sp[1]));
        }

        List<Integer> expList = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            // expire day calculate
            String type = privacies[i].split(" ")[1];

            String numbers = privacies[i].split(" ")[0];
            String[] regDate = numbers.split("\\.");

            int expYear = Integer.parseInt(regDate[0]);
            int expMonth = Integer.parseInt(regDate[1]);
            int expDay = Integer.parseInt(regDate[2]);
            int expDate = expCalculate2(expYear, expMonth, expDay, termMap.get(type));
            // add to list
            if (expDate < date) {
                expList.add(i + 1);
            }
        }
        return expList.stream().mapToInt(x -> x).toArray();
    }
    public static int expCalculate2(int Y,int M, int D, int p){
        return Y*12*28 + M*28 + D + p*28 -1;
    }

}
