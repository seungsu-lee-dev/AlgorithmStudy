import java.io.*;
import java.util.*;

public class BOJ_14425 {
	public void stringSetSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer nmStr = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(nmStr.nextToken());
		int M = Integer.parseInt(nmStr.nextToken());
		
		Set<String> sSet = new HashSet<String>();
		for (int index = 0; index < N; index++) {
			String str = br.readLine();
			sSet.add(str);
		}
		
		int count = 0;
		for (int index = 0; index < M; index++) {
			String str = br.readLine();
			if (sSet.contains(str))
				count++;
		}
		
		bw.write(String.valueOf(count));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_14425().stringSetSolution();
	}
}