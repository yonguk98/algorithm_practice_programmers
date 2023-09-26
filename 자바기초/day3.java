package 자바기초;

import java.io.InputStream;
import java.util.Arrays;

public class day3 {
    public static void main(String[] args) {

    }

    public int solution1(int num, int n) {
        return num%n==0?1:0;
    }

    public int solution2(int n) {
        int answer = 0;
        if(n%2==0){
            for (int i = 0; i <= n; i+=2) {
                answer+=i*i;
            }
        }else{
            for (int i = 1; i <= n; i+=2) {
                answer+=i;
            }
        }
        return answer;
    }
    public int solution3(String ineq, String eq, int n, int m) {
        if(ineq.equals("<")){
            if(eq.equals("=")){return n<=m?1:0;}
            else{return n<m?1:0;}
        }else {
            if(eq.equals("=")){return n>=m?1:0;}
            else{return n>m?1:0;}
        }
    }

    public int solution4(int a, int b, boolean flag) {
        return flag?a+b:a-b;
    }
    public String solution5(String code) {
        char[] charArray = code.toCharArray();
        boolean mode = true;
        String ret="";
        for (int i = 0; i < charArray.length; i++) {
            if(charArray[i]=='1'){
                mode = !mode;
                continue;
            }
            if (mode&&(i%2==0)){
                ret+=charArray[i];
            } else if (!mode&&(i%2==1)) {
                ret+=charArray[i];
            }
        }
        if(ret.equals("")){ret="EMPTY";}
        return ret;
    }

    public int solution6(int a, int d, boolean[] included) {
        int answer = 0;
        for (boolean b : included) {
            if(b){answer+=a;}
            a+=d;
        }
        return answer;
    }

    public static int solution7(int a, int b, int c) {
        int answer = 0;
        if(a==b && b==c){
            answer= (int) (Math.pow(3*a*a,3));
        } else if (a==b || b==c || c==a) {
            answer = (a+b+c)*(a*a+b*b+c*c);
        }else{
            answer = a+b+c;
        }
        return answer;
    }
    public int solution8(int[] num_list) {
        int add = 0;
        int mul = 1;
        for (int i : num_list) {
            add +=i;
            mul *=i;
        }
        return add*add > mul?1:0;
    }

    public int solution9(int[] num_list) {
//        String even="";
//        String odd="";
//        for (int i : num_list) {
//            if(i%2==0){
//                even +=i;
//            }else{
//                odd+=i;
//            }
//        }
//        return Integer.parseInt(even)+Integer.parseInt(odd);

        int even = 0;
        int odd=0;

        for (int i : num_list) {
            if(i%2==0){
                even*=10;
                even+=i;
            }else{
                odd*=10;
                odd+=i;
            }
        }
        return even+odd;
    }
}
