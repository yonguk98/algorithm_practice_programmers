
import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int testCase = 1; testCase <= 10; testCase++) {
            int n = Integer.parseInt(br.readLine());

            String[] s = br.readLine().split(" ");
            int[] arr = new int[100];
            for (int i = 0; i < 100; i++) {
                arr[i] = Integer.parseInt(s[i]);
            }
            for (int i = 0; i < n; i++) {
                Arrays.sort(arr);
                arr[0]+=1;
                arr[99]-=1;
            }

            System.out.println("#" + testCase + " " + (Arrays.stream(arr).max().getAsInt() - Arrays.stream(arr).min().getAsInt()));
        }
	}
}