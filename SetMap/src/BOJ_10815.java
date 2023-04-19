import java.io.*;
import java.util.*;

public class BOJ_10815 {
	public void numCardSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		Set<String> card = new HashSet<String>();
		
		StringTokenizer cardStr = new StringTokenizer(br.readLine());
		for (int index = 0; index < N; index++) {
			card.add(cardStr.nextToken());
		}
		
		int M = Integer.parseInt(br.readLine());
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer card2Str = new StringTokenizer(br.readLine());
		
		for (int index = 0; index < M; index++) {
			String num = card2Str.nextToken();
			if (card.contains(String.valueOf(num))) {
				sb.append("1").append(" ");
			}
			else {
				sb.append("0").append(" ");
			}
		}
		System.out.println(sb);
	}
	public static void main(String[] args) throws Exception {
		new BOJ_10815().numCardSolution();
	}
}