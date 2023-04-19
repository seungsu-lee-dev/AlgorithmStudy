import java.io.*;
import java.util.*;

public class BOJ_10816 {
	public void numCard2Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		HashMap<Integer, Integer> cardMap = new HashMap<>();
		
		StringTokenizer cardStr = new StringTokenizer(br.readLine());
		for (int index = 0; index < N; index++) {
			Integer num = Integer.parseInt(cardStr.nextToken());
			if (cardMap.get(num) != null) {
				cardMap.put(num, cardMap.get(num) + 1);
			}
			else {
				cardMap.put(num, 1);
			}
		}
		
		int M = Integer.parseInt(br.readLine());
		StringTokenizer card2Str = new StringTokenizer(br.readLine());
		for (int index = 0; index < M; index++) {
			Integer num = Integer.parseInt(card2Str.nextToken());
			if (cardMap.get(num) != null) {
				bw.write(String.valueOf(cardMap.get(num)));
			}
			else {
				bw.write("0");
			}
			bw.write(" ");
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_10816().numCard2Solution();
	}
}