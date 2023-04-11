import java.io.*;
import java.util.*;

public class BOJ_2750 {
	public void numSortSolution() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String inputStr = br.readLine();
		int N = Integer.parseInt(inputStr);
		
		ArrayList<Integer> numList = new ArrayList<>();
		
		for (int index = 0; index < N; index++) {
			numList.add(Integer.parseInt(br.readLine()));
		}
		
		Collections.sort(numList);
		
		for (int index = 0; index < N; index++) {
			bw.write(String.valueOf(numList.get(index)));
			bw.newLine();
		}
		bw.flush();
		bw.close();
	}
	public static void main(String[] args) throws Exception {
		new BOJ_2750().numSortSolution();
	}
}