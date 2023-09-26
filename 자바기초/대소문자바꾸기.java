package 자바기초;

import java.util.Scanner;

public class 대소문자바꾸기 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for (char x : a.toCharArray()) {
            if (Character.isUpperCase(x)) {
                System.out.print(Character.toLowerCase(x));
            } else {
                System.out.print(Character.toUpperCase(x));
            }
        }

        System.out.println("!@#$%^&*(\\'\"<>?:;");
    }
}
