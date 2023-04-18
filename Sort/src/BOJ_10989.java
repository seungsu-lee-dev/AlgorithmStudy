import java.io.*;
import java.util.*;

public class BOJ_10989 {
	public void numSort3Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		int[] numArray = new int[N];
		
		
		for (int index = 0; index < N; index++) {
			numArray[index] = Integer.parseInt(br.readLine());
		}
		
		Arrays.sort(numArray);
		
		for (int index = 0; index < N; index++) {
			bw.write(String.valueOf(numArray[index]));
			bw.newLine();
			
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_10989().numSort3Solution();
	}
}