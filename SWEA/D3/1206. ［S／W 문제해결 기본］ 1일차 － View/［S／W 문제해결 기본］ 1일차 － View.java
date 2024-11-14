import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            int answer = 0;

            int n = Integer.parseInt(br.readLine());
            int[] b = new int[n];

            String[] string = br.readLine().split(" ");

            for (int j = 0; j < string.length; j++) {
                b[j] = Integer.parseInt(string[j]);
            }

            int[] count = new int[n];
            for (int j = 2; j < n-2; j++) {
                if(b[j] > b[j+1] && b[j] > b[j+2] && b[j] > b[j-1] && b[j] > b[j-2]) {
                    count[j] = Math.min(b[j] - Math.max(b[j+1], b[j+2]),b[j] - Math.max(b[j-1], b[j-2]));
                }
            }
            for(int c : count){
                answer += c;
            }
            System.out.println("#"+ (i + 1) + " " + answer);
        }
	}
}