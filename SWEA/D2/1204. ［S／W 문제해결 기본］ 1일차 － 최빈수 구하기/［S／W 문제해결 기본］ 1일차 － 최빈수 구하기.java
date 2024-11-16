import java.util.Scanner;
import java.io.FileInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int testCase = 1; testCase <= T; testCase++) {
            br.readLine();
            String[] input = br.readLine().split(" ");

            List<Integer> list = new ArrayList<>();
            for (int i = 0; i < input.length; i++) {
                list.add(Integer.parseInt(input[i]));
            }

            Collections.sort(list, Collections.reverseOrder());

            int count = 1;
            int maxCount = 0;
            int max = 0;
            for (int i = 1; i < list.size(); i++) {
                if (Objects.equals(list.get(i), list.get(i - 1))) {
                    count += 1;
                } else {
                    if (maxCount < count) {
                        max = list.get(i-1);
                        maxCount = count;
                    }
                    count = 0;
                }
            }

            System.out.println("#" + testCase + " " + max);
        }
	}
}