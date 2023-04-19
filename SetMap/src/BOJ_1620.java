import java.io.*;
import java.util.*;

public class BOJ_1620 {
	public void pocketmonSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer nmStr = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(nmStr.nextToken());
		int M = Integer.parseInt(nmStr.nextToken());
		HashMap<Integer, String> dogamMap1 = new HashMap<>();
		HashMap<String, Integer> dogamMap2 = new HashMap<>();
		
		for (int index = 1; index <= N; index++) {
			String pocketmon = br.readLine();
			dogamMap1.put(index, pocketmon);
			dogamMap2.put(pocketmon, index);
		}
		
		for (int index = 0; index < M; index++) {
			String pocketmon = br.readLine();
			// 숫자면
			if (Character.isDigit(pocketmon.charAt(0))) {
				bw.write(dogamMap1.get(Integer.parseInt(pocketmon)));
			}
			else {
				bw.write(String.valueOf(dogamMap2.get(pocketmon)));
			}
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_1620().pocketmonSolution();
	}
}