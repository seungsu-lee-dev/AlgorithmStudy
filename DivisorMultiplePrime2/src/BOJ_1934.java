import java.io.*;
import java.util.*;

public class BOJ_1934 {
	public void leastCommonMultipleSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		int L = 0;
		StringBuilder sb = new StringBuilder();
		
		for (int index = 0; index < T; index++) {
			StringTokenizer numStr = new StringTokenizer(br.readLine());
			int num1 = Integer.parseInt(numStr.nextToken());
			int num2 = Integer.parseInt(numStr.nextToken());
			if (num1 < num2) {
				int temp = num1;
				num1 = num2;
				num2 = temp;
			}
			for (int j = num2; j > 0; j--) {
				if (num2 % j == 0 && num1 % j == 0) {
					L = (num1 / j) * (num2 / j) * j;
					sb.append(L + "\n");
					break;
				}
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) throws Exception {
		new BOJ_1934().leastCommonMultipleSolution();
	}
}