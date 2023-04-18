import java.io.*;
import java.util.*;

public class BOJ_2751 {
	public void numSort2Solution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int index = 0; index < N; index++) {
			numList.add(Integer.parseInt(br.readLine()));
		}
		
		numList.sort(null);
		
		for (int index = 0; index < N; index++) {
			bw.write(String.valueOf(numList.get(index)));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_2751().numSort2Solution();
	}
}