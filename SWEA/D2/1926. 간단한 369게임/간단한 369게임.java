import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            String s = String.valueOf(i);
            int count = 0;
            for (int j = 0; j < s.length(); j++) {
                if(s.charAt(j) == '3' || s.charAt(j) == '6' || s.charAt(j) == '9') count+=1;
            }
            if (count == 0)System.out.print(i);
            else{
                for (int j = 0; j < count; j++) {
                    System.out.print('-');
                }
            }
            System.out.print(" ");
        }
	}
}