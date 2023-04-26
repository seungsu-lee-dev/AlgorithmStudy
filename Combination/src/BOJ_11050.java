import java.io.*;
import java.util.*;

public class BOJ_11050 {
	public void bionomialSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer nkStr = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(nkStr.nextToken());
		int K = Integer.parseInt(nkStr.nextToken());
		int fact1 = 1;
		int fact2 = 1;
		for (int index = N-K+1; index <= N; index++) {
			fact1 *= index;
		}
		for (int index = 1; index <= K; index++) {
			fact2 *= index;
		}
		bw.write(String.valueOf(fact1/fact2));
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_11050().bionomialSolution();
	}
}