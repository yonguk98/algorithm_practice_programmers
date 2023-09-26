package 자바기초;

import java.util.Scanner;

public class 문자열반복해서출력 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print(str);
        }
    }
}
