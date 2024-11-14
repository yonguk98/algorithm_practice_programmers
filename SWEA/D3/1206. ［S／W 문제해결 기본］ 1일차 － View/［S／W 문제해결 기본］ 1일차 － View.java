/////////////////////////////////////////////////////////////////////////////////////////////
// 기본 제공코드는 임의 수정해도 관계 없습니다. 단, 입출력 포맷 주의
// 아래 표준 입출력 예제 필요시 참고하세요.
// 표준 입력 예제
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int 변수 1개 입력받는 예제
// b = sc.nextDouble();                        // double 변수 1개 입력받는 예제
// g = sc.nextByte();                          // char 변수 1개 입력받는 예제
// var = sc.next();                            // 문자열 1개 입력받는 예제
// AB = sc.nextLong();                         // long 변수 1개 입력받는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
// 표준 출력 예제
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int 변수 1개 출력하는 예제
//System.out.println(b); 		       						 // double 변수 1개 출력하는 예제
//System.out.println(g);		       						 // char 변수 1개 출력하는 예제
//System.out.println(var);		       				   // 문자열 1개 출력하는 예제
//System.out.println(AB);		       				     // long 변수 1개 출력하는 예제
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
/*
   사용하는 클래스명이 Solution 이어야 하므로, 가급적 Solution.java 를 사용할 것을 권장합니다.
   이러한 상황에서도 동일하게 java Solution 명령으로 프로그램을 수행해볼 수 있습니다.
 */
class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());

            String[] string = br.readLine().split(" ");
            List<Integer> buildings = new ArrayList<>();
            int answer = 0;

            for(String s : string) {
                buildings.add(Integer.parseInt(s));
            }

            int[] countR = new int[n];
            for (int j = 2; j < n-2; j++) {
                if(buildings.get(j) > buildings.get(j+1) && buildings.get(j) > buildings.get(j+2)) {
                    countR[j] = buildings.get(j) - Math.max(buildings.get(j+1), buildings.get(j+2));
                }
            }

            int[] countL = new int[n];
            for (int j = n - 3; j >= 2; j--) {
                if(buildings.get(j) > buildings.get(j-1) && buildings.get(j) > buildings.get(j-2)) {
                    countL[j] = buildings.get(j) - Math.max(buildings.get(j-1), buildings.get(j-2));
                }
            }

            for (int j = 0; j < countL.length; j++) {
                if(countL[j] > 0 && countR[j] > 0) {
                    answer+=Math.min(countR[j], countL[j]);
                }
            }

            System.out.println("#"+ (i + 1) + " " + answer);

        }
	}
}